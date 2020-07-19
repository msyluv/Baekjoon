package swPro.practice1;

import java.io.*;

public class sw_5543 {

    static int[] burgerPrice;
    static int[] drinkPrice;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        burgerPrice = new int[3];
        drinkPrice = new int[2];

        for (int i = 0; i < 3; i++) {
            burgerPrice[i] = Integer.parseInt(br.readLine());
        }
        int burgerMin = Math.min(burgerPrice[0], burgerPrice[1]);
        burgerMin = Math.min(burgerMin, burgerPrice[2]);

        for (int i = 0; i < 2; i++) {
            drinkPrice[i] = Integer.parseInt(br.readLine());
        }
        int drinkMin = Math.min(drinkPrice[0], drinkPrice[1]);

        bw.write(burgerMin+drinkMin-50+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
}

package swPro.practice1;

import java.io.*;

public class sw_2523 {

    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < i+1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        for (int i = T; i > 1; i--) {
            for (int j = i-1; j > 0; j--) {
                bw.write("*");
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

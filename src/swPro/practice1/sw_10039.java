package swPro.practice1;

import java.io.*;

public class sw_10039 {

    static int num;
    static int sum = 0;
    static final String NEW_LINE = "\n";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 5; i++) {
            sum += Math.max(Integer.parseInt(br.readLine()), 40);
        }
        bw.write(sum/5 + NEW_LINE);
        br.close();
        bw.flush();
        bw.close();
    }
}

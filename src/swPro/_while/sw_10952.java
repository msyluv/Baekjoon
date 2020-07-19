package swPro._while;

import java.io.*;
import java.util.StringTokenizer;

public class sw_10952 {

    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A+B == 0) break;

            bw.write(A+B + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

package swPro._while;

import java.io.*;
import java.util.StringTokenizer;

public class sw_10951 {

    private static final String NEW_LINE = "\n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String line;

        while ( (line=br.readLine()) != null) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(A + B + NEW_LINE);
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

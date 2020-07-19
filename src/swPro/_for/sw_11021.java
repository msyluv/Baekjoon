package swPro._for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sw_11021 {

    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            System.out.println("Case #" + (i+1) + ": " +
                    (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) );
        }
    }
}

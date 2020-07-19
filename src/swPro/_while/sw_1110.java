package swPro._while;

import java.io.*;

public class sw_1110 {

    private static final String NEW_LINE = "\n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean flag = true;
        int tens;
        int units;
        int newNumber;
        int cnt = 0;

        int T = Integer.parseInt(br.readLine());
        newNumber = T;
        while (flag) {
            tens = fn_tens(newNumber);
            units = fn_units(newNumber);
            newNumber = (units*10) + fn_units(tens + units);

            cnt++;
            if (newNumber == T) {
                flag = false;
                bw.write(cnt + NEW_LINE);
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static int fn_tens(int input) {
        if (input >= 10) {
            return input/10;
        } else {
            return 0;
        }
    }

    private static int fn_units(int input) {
        if (input >= 10) {
            return input%(10*fn_tens(input));
        } else {
            return input;
        }
    }
}

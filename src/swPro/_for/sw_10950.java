package swPro._for;

import java.util.Scanner;

public class sw_10950 {

    static int T;
    static int A;
    static int B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}

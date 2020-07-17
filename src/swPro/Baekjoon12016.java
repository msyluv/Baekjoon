package swPro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon12016 {
    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
//
//        int[] arr = new int[num];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < num; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }

        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = i+1;
            System.out.println("arr["+i+"] : " + arr[i] + ", divided val : " + arr[i]%(Math.pow(10, 9)+7));
        }
    }
}

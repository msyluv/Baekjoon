package swPro;

import java.util.*;

public class Baekjoon2493 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();

        int[] inputArray = new int[loop];
        for (int i = 0; i < loop; i++) {
            inputArray[i] = sc.nextInt();
        }

        Stack<Integer> indexStack = new Stack();
        Stack<Integer> valueStack = new Stack();
        indexStack.push(0);
        valueStack.push(0);
        indexStack.push(1);
        valueStack.push(inputArray[0]);
        //(1,6)
        int[] resultArray = new int[loop];
        resultArray[0] = 0;

        for (int i = 1; i < loop; i++) {
            if (inputArray[i] >= valueStack.peek()) {
//                System.out.println(i + " trial -> if yes");
                indexStack.pop(); valueStack.pop();
                System.out.println(indexStack.peek());
                resultArray[i] = indexStack.peek();
                indexStack.push(i+1); valueStack.push(inputArray[i]);
            } else {
//                System.out.println(i + " trial -> else");
                resultArray[i] = indexStack.peek();
                indexStack.push(i+1); valueStack.push(inputArray[i]);
            }
        }

        for (int i = 0; i < loop; i++) {
            if (i == loop-1) {
                System.out.print(resultArray[i]);
            } else {
                System.out.print(resultArray[i] + " ");
            }
        }
    }

}

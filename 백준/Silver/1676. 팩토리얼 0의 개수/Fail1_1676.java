package boj.silver._1676;

import java.util.Scanner;

public class Fail1_1676 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;

        String number = Integer.toString(factorial(N));
        String[] arr = number.split("");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("0")) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }

    public static int factorial(int num) {
        int sum = 1;
        while (num > 0) {
            sum *= num;
            num--;
        }
        return sum;
    }
}
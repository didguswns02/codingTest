import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[9];
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }
        int max = A[0];
        int idx = 1;
        for (int j = 0; j < A.length; j++) {
            if (A[j] > max) {
                max = A[j];
                idx = j + 1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
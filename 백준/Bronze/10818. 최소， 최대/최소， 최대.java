import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] Array = new int[T];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = in.nextInt();
        }
        int max = Array[0];
        int min = Array[0];
        for (int j = 0; j < Array.length; j++) {
            if (Array[j] > max) {
                max = Array[j];
            }
            if (Array[j] < min) {
                min = Array[j];
            }
        }
        System.out.print(min + " ");
        System.out.print(max);
    }
}

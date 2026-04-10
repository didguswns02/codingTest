import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] weight = new int[n];
        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            weight[i] = in.nextInt();
            height[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if ((weight[j] > weight[i]) && (height[j] > height[i])) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
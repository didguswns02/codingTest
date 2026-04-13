import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] num1 = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num1[i] = Integer.parseInt(st1.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] num2 = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            num2[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(num1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int target = num2[i];
            boolean isFind = false;

            int leftIndex = 0;
            int rightIndex = num1.length - 1;

            while (leftIndex <= rightIndex) {
                int midIndex = (leftIndex + rightIndex) / 2;

                if (num1[midIndex] == target) {
                    isFind = true;
                    break;
                } else if (num1[midIndex] < target) {
                    leftIndex = midIndex + 1;
                } else {
                    rightIndex = midIndex - 1;
                }
            }

            if (isFind) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);
    }
}
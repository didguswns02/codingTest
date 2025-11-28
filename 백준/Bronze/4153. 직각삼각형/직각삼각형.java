import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 3개의 변 입력받기
        while(true) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if((a==0) && (b==0) && (c==0)) break;

            int[] arr = {a, b, c};
            Arrays.sort(arr);
            if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]) {
                System.out.println("right");
            } else
                System.out.println("wrong");
        }
    }
}

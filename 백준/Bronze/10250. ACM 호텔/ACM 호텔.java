import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // 테스트 케이

        for (int i = 0; i < T; i++) {
            int H = in.nextInt();
            int W = in.nextInt();
            int N = in.nextInt();

            if ((N % H) == 0) {
                System.out.println((H * 100) + (N / H));
            } else {
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }
    }
}

        /*
        int T = in.nextInt();
        int N = 0;
        int X, Y, H;
        if ((N % H) == 0) {
         Y = H * 100;
         X = N / H;
        }
        else {
            Y = (N % H) * 100;
            X = (N / H) + 1;
        }
        int XXYY = Y + X;
         */

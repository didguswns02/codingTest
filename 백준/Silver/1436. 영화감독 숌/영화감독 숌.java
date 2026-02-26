import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int cnt = 0;
        int num = 666;
        while(true) {
            if(String.valueOf(num).contains("666")) {
                cnt++;
                if (cnt == N) break;
            }
            num++;
        }
        System.out.println(num);
    }
}

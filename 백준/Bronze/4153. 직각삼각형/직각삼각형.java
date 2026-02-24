import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if (a == 0 && b == 0 && c == 0) break;

            if (rect(a, b, c)) {
                System.out.println("right");
            } else System.out.println("wrong");
        }
    }
    public static boolean rect(int a, int b, int c) {
        long a2 = (long)a * a;
        long b2 = (long)b * b;
        long c2 = (long)c * c;

        if (a2 + b2 == c2) return true;
        if (b2 + c2 == a2) return true;
        if (c2 + a2 == b2) return true;

        return false;
    }
}

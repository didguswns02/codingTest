import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int A = in.nextInt();
       int B = in.nextInt();
       int C = in.nextInt();

        System.out.println(A + B - C);

        int AB = Integer.parseInt(""+ A + B);
        System.out.println(AB - C);
    }}
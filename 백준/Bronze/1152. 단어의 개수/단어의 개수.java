import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine(); // 1
        int count = 0;
        String[] words = s.trim().split(" ");
        for (String w : words) {
            if (!w.equals("")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

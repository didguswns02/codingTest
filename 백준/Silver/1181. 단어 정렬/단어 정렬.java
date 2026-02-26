import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        TreeSet<String> set = new TreeSet<>(new lengthComparator());

        for (int i = 0; i < num; i++) {
            set.add(in.next());
        }

        for (String word : set) {
            System.out.println(word);
        }
    }


    public static class lengthComparator implements Comparator<String> {
        public int compare(String s1, String s2) {
            if (s1.length() < s2.length()) return -1;
            else if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            else return 1;
        }
    }

}

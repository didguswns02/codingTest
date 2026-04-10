import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        int[] ages = new int[n];      
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ages[i] = Integer.parseInt(st.nextToken());
            names[i] = st.nextToken();
        }

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;

        Arrays.sort(idx, (a, b) -> ages[a] - ages[b]);

        StringBuilder sb = new StringBuilder();
        for (int i : idx) {
            sb.append(ages[i]).append(" ").append(names[i]).append("\n");
        }
        System.out.print(sb);
    }
}
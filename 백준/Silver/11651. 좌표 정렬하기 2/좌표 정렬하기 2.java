import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] X = new int[N];
        int[] Y = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            X[i] = Integer.parseInt(st.nextToken());
            Y[i] = Integer.parseInt(st.nextToken());
        }

        Integer[] idx = new Integer[N];
        for (int i = 0; i < N; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) -> {
            if (Y[a] == Y[b]) {
                return X[a] - X[b];
            } else {
                return Y[a] - Y[b];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(X[idx[i]]).append(" ").append(Y[idx[i]]).append("\n");
        }

        System.out.println(sb);
    }
}
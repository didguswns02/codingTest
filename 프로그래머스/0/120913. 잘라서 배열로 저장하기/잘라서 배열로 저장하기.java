class Solution {
    public String[] solution(String my_str, int n) {
        int size = 0;
        if (my_str.length() % n == 0) {
            size = my_str.length() / n;
        } else {
            size = (my_str.length() / n) + 1;
        }
        int idx = 0;
        String[] arr = new String[size];
        for (int i = 0; i < my_str.length(); i += n) {
            int end = Math.min(i + n, my_str.length());
            arr[idx] = my_str.substring(i, end);
            idx++;
        }
        return arr;
    }
}
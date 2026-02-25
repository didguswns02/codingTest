class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int total = 0;
        int last = 0;
        for (String str : arr) {
            if (str.equals("Z")) {
                total -= last;
            } else {
                int x = Integer.parseInt(str);
                total += x;
                last = x;
            }
        }
        return total;
    }
}
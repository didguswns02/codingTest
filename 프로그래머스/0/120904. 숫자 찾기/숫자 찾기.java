class Solution {
    public int solution(int num, int k) {
        String str = num + "";
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == k) {
                return i + 1;
            }
        }
        return -1;
    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] num_list02 = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            num_list02[(num_list.length - 1) - i] = num_list[i];
        }
        return num_list02;
    }
}
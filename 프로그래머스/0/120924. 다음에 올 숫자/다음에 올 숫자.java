class Solution {
    public int solution(int[] common) {
        int answer = 0;
            if (common[2] - common[1] == common[1] - common[0]) {
                int d = common[2] - common[1];
                answer = common[common.length - 1] + d;
                return answer;
            } else {
                int r = common[2] / common[1];
                answer = common[common.length - 1]  * r;
                return answer;
            }
    }
}
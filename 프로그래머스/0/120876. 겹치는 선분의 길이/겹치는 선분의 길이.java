class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] array = new int[201];
        
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
                array[j]++;
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 2) {
                answer++;
            }
        }
        return answer;
        
    }
}
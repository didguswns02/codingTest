import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] array, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : array) {
            map.put(a, Math.abs(a- n));
        }
        
        int min = Integer.MAX_VALUE;
        int answer = 0;
        
        for (int key : map.keySet()) {
            int diff = map.get(key);
            if (diff < min) {
                min = diff;
                answer = key;
            } else if (diff == min) {
                Math.min(answer, key);
            }
        }
        return answer;
    }
}
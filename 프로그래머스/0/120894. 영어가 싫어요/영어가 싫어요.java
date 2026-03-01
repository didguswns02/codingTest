import java.util.Map;
import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", 
                        "six", "seven", "eight", "nine"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (String key : map.keySet()) {
            numbers = numbers.replace(key, String.valueOf(map.get(key)));
        }
        return Long.parseLong(numbers);
    }
}
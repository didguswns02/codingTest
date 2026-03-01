import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count == 1) {
                answer += arr[i];
            }
        }
        char[] arr2 = answer.toCharArray();
        Arrays.sort(arr2);
        String answer2 = "";
        for (char c : arr2) {
            answer2 += c;
        }
        return answer2;
    }
}
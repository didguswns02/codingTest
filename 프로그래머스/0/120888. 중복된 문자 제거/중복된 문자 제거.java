class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    arr[j] = "";
                }
            }
        }
        for (String s : arr) {
            answer += s;
        }
        return answer;
    }
}
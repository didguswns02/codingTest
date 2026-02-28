class Solution {
    public int solution(int order) {
        String str = Integer.toString(order);
        String[] arr = str.split("");
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if((Integer.parseInt(arr[i]) % 3 == 0) && 
               (Integer.parseInt(arr[i]) != 0)) {
                answer++;
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};
        int count = 0;
        
        for (String b : babbling) {
            for (String a : arr) {
                    b = b.replace(a, " ");
            }
            if(b.trim().isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
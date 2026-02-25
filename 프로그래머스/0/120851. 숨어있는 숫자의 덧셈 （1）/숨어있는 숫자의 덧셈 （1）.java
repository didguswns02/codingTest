class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");
        String[] number = my_string.split("");
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            total += Integer.parseInt(number[i]);
    }
        return total;
}
}
class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");
        String[] number = my_string.split("");
        int[] number2 = new int[my_string.length()];
        for (int i = 0; i < number.length; i++) {
            number2[i] = Integer.parseInt(number[i]);
    }
        int total = 0;
        for (int j = 0; j < number2.length; j++) {
            total += number2[j];
        }
        return total;
}
}
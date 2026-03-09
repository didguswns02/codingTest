import java.util.Arrays;

class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");
        
        int xCount = Arrays.stream(terms)
            .filter(s -> s.contains("x"))
            .mapToInt(s -> {
                String num = s.replace("x", "");
                return num.isEmpty() ? 1 : Integer.parseInt(num);
            })
            .sum();
        
        int constant = Arrays.stream(terms)
            .filter(s -> !s.contains("x"))
            .mapToInt(Integer::parseInt)
            .sum();
        
        StringBuilder answer = new StringBuilder();
        
        if (xCount > 0) {
            answer.append(xCount == 1 ? "" : xCount).append("x");
        }
        if (constant > 0) {
            if (answer.length() > 0) answer.append(" + ");
            answer.append(constant);
        }

        return answer.toString();
    }
}
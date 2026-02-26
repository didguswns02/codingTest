import java.util.Set;
import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>();
        String[] arr = my_string.split("");
        String answer = "";
        for (String s : arr) {
            set.add(s);
        }
        for (String s : set) {
            answer += s;
        }
        return answer;
    }
}
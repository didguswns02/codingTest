class Solution {
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            String word = dic[i];
            int count = 0;
            
            for (int j = 0; j < spell.length; j++) {
                if (word.contains(spell[j])) {
                    count++;
                }
            }
            
            if (count == word.length() && count == spell.length) {
                return 1;
            }
        }
        return 2;
    }
}
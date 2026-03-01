import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>(); 
        
        for (int i = 0; i < s1.length; i++) {
            map1.put(i, s1[i]);
        }
        for (int i = 0; i < s2.length; i++) {
            map2.put(i, s2[i]);
        }
        int count = 0;
        Iterator<Integer> iterator1 = map1.keySet().iterator();
        while (iterator1.hasNext()) {
            int key1 = iterator1.next();
            String str1 = map1.get(key1);
            Iterator<Integer> iterator2 = map2.keySet().iterator();
             while (iterator2.hasNext()) {
             int key2 = iterator2.next();
             String str2 = map2.get(key2);
                if (str1.equals(str2)) {
                    count++;
                }
            }
        }
        return count;
}
}

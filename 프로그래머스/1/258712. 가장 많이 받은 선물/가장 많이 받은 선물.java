import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) { 
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }
        
        int n = friends.length;
        int[][] giftGraph = new int[n][n];
        int[] giftScore = new int[n];
        
        for (String gift : gifts) {
            String[] arr = gift.split(" ");
            
            String giver = arr[0];
            String receiver = arr[1];
            
            int giverIdx = map.get(giver);
            int receiverIdx = map.get(receiver);
            
            giftGraph[giverIdx][receiverIdx] += 1;
            
            giftScore[giverIdx] += 1;
            giftScore[receiverIdx] -= 1;
        }
        int[] nextMonthGift = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int gave = giftGraph[i][j];
                int received = giftGraph[j][i];
                
                if (gave > received) {
                    nextMonthGift[i] += 1;
                } else if (received > gave) {
                    nextMonthGift[j] += 1;
                } else {
                    if (giftScore[i] > giftScore[j]) {
                        nextMonthGift[i] += 1;
                    } else if (giftScore[j] > giftScore[i]) {
                        nextMonthGift[j] += 1;
                    } 
                }
            }
        }
        int maxGift = 0;
        for (int i = 0; i < nextMonthGift.length; i++) {
            if (nextMonthGift[i] > maxGift) {
                maxGift = nextMonthGift[i];
            }
        }
        return maxGift;
        
    }
}
class Solution {
    public int solution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <=1; y++) {
                            if (x == 0 && y == 0) {
                                continue;
                            }
                            int ni = i + x;
                            int nj = j + y;
                            if ((ni >= 0 && ni < board.length) && 
                                (nj >= 0 && nj < board.length) ) {
                                if (board[ni][nj] == 0) {
                                    board[ni][nj] = 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        int answer = board.length * board.length;
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1 || board[i][j] == 2) {
                    count++;
                }
            }
        }
        answer = answer - count;
        return answer;
    }
}
class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        // 1. 출근 인정 시각을 담는 배열 선언 후 데이터 채우기
        int[] clockIn = new int[schedules.length];
        for (int i = 0; i < schedules.length; i++) {
            int hour = schedules[i] / 100;
            int minute = schedules[i] % 100 + 10;
            
            if (minute >= 60) {
                hour += 1;
                minute -= 60;
            }
            
            clockIn[i] = hour * 100 + minute;
        }
        // 2. timelogs에서 각 직원의 출근 시간이 clockIn의 시간보다 넘는지 확인 
        int count = 0; // 성공 직원 수
        for (int i = 0; i < timelogs.length; i++) {
            boolean isSuccess = true;
            for (int j = 0; j < timelogs[i].length; j++) {
                int currentDay = (startday + j) % 7;
                // 만약 현재 날짜가 토(6) 이거나 일(0) 이면 건너뜀.
                if (currentDay == 6 || currentDay == 0) {
                    continue;
                }
                // 지각 했을 경우
                if (clockIn[i] < timelogs[i][j]) { 
                    isSuccess = false;
                    break;
                }
            }
            if (isSuccess == true) {
                count++;
            }
        }
        return count;
    }
}
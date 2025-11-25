import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // A, B, C 정수 입력
        long A = in.nextInt();
        long B = in.nextInt();
        long C = in.nextInt();
        // 세 정수의 곱을 저장할 result 변수
        long result = A * B * C;
        // 0~9까지 숫자 개수를 셀 배열 선언
        int[] count = new int[10];
        // result에서 1자리씩 떼어내기
        do {
            int digit = (int)(result % 10);
            count[digit]++;
            result /= 10;
        } while (result > 0);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}
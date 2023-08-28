package S_소수의합구하기;

import java.util.Scanner;

// 입력 받은 정수보다 작은 소수의 합을 구하는 함수를 만드세요.
// 예) 12이면 2+3+5+7+11 = 28;
// 소수란? 1과 자기 자신 이외의 자연수로 나누어 지지 않는 수
public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 2; i < num ; i++) {
            int n = 0;
            for(int j = 2; j < i; j++) {
                if (i % j == 0) n++;
            }
            if (n > 0) n = 0;
            else if(n == 0) n = i;
            sum += n;
        }
        System.out.println(sum);
    }
}

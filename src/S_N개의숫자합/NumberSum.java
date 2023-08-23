package S_N개의숫자합;

import java.util.Scanner;

// 첫째 줄에 숫자의 개수 N 입력.
// 둘째 줄에 N개의 숫자가 공백 없이 쓰여있다.
// input : 12345
// output : 15
public class NumberSum {
    public static void main(String[] args) {
        // 입력을 받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 입력할 숫자의 갯수 n
        System.out.print("숫자의 개수 입력 : ");
        int n = sc.nextInt();
        // n개의 숫자 입력 및 저장
        System.out.print("숫자 : ");
        String num = sc.next();
        // 합계 변수 초기화;
        int sum = 0;

        for(int i = 0; i < num.length(); i++) {
            // ASCII 코드의 0에 해당하는 값을 빼줘야 함
            sum += num.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}

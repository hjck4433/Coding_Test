package S_핸드폰요금;

import java.util.Scanner;

// 영식 요금제 Y : 30초 10원 (30초가 되면 2통)
// 민식 요금제 M : 60초 15원 (60초가 되면 2통)
// 첫번째 입력 : 통화 횟수 (20 미만)
// 두번째 줄 : 각 통화 시간(초단위)
// 출력은 싼 요금제를 출력 영식 요금제는 Y 60, 민식 요금제는 M 45
// 총 통화 요금이 같이 경우는 YM 총 통화 요금 표시
// 3 40 40 40 => M 45
public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("통화 횟수 : ");
        int n = sc.nextInt();
        Payment payment = new Payment(n);
        payment.cheapPayment();
    }
}

package S_핸드폰요금;

import java.util.Scanner;

// 영식 요금제 Y : 30초 10원 (30초가 되면 2통)
// 민식 요금제 M : 60초 15원 (60초가 되면 2통)
// 첫번째 입력 : 통화 횟수 (20 미만)
// 두번째 줄 : 각 통화 시간(초단위)
// 출력은 싼 요금제를 출력 영식 요금제는 Y 60, 민식 요금제는 M 45
// 총 통화 요금이 같이 경우는 YM 총 통화 요금 표시
// 3 40 40 40 => M 45
public class Payment {
    private int[] callTime;
    private int ySum = 0;
    private int mSum = 0;
    private final int YPAY = 10;
    private final int MPAY = 15;
    Payment(int n) {
        callTime = new int [n];
        setCallTime(n);
    }
    public void setCallTime(int n) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            int call = sc.nextInt();
            callTime[i] = call;
        }
    }
    public void getCallTime() {
        for(int e : callTime) System.out.print(e + " ");
    }

    public void totalCost() {
        for (int j : callTime) {
            ySum += ((j / 30) + 1) * YPAY;
            mSum += ((j / 60) + 1) * MPAY;
        }
    }

    public void cheapPayment() {
        totalCost();
        if(ySum == mSum) System.out.println("YM "+ ySum);
        else {
            if (ySum < mSum) {
                System.out.println("Y" + ySum);
            } else {
                System.out.println("M" + mSum);
            }
        }
    }


}

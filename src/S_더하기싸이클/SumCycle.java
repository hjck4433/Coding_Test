package S_더하기싸이클;

import java.util.Scanner;
//0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고,
// 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어
// 붙이면 새로운 수를 만들 수 있다
// 26 / 2+6=8 / 68
// 68 / 6+8=14/ 84
// 84 / 8+4=12 / 42
// 42/ 4+2=6 / 26   => 4번의 사이클
// 사이클 길이 구하기
public class SumCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0; int b = 0; int c = 0;
        int cnt = 0;
        int start = sc.nextInt();
        if (start < 10) {
            b = start;
        } else {
            a = start / 10; b = start % 10;
        }
        c= a+b;
        while(true) {
            cnt++;
            int newNum = b * 10 + (c % 10);
            if(newNum == start)break;
            else {
                if (newNum < 10) {
                    a = 0; b = newNum;
                }else {
                    a = newNum / 10; b = newNum % 10;
                }
                c = a+b;
            }
        }
        System.out.println(cnt);
    }
}

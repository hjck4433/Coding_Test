package S_전자레인지;

import java.util.Scanner;

// A - 5분 / B - 1분 / C-10초
// 1 ~ 10,000 사이 초 입력
// 출력 A(횟수) B(횟수) C(횟수) // 정확하게 초를 맞출수 없으면 -1;
public class MicroWave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int A = 60 * 5;
        final int B = 60;
        final int C = 10;
        int cntA = 0;
        int cntB = 0;
        int cntC = 0;
        int num = sc.nextInt();
        if(num >= A) { // 숫자가 A와 같거나 크면
            cntA = num / A; // 숫자를 A로 나눈 값 대입
            if (num % A >= B) { // A로 나눈 나머지가 B보다 크면
                cntB = (num % A) / B; // A로 나눈 나머지 나누기 B 대입
                if ((num % A) % B > 0) { //B로 나눈 나머지가 0보다 크면
                    cntC = ((num % A) % B) / C; // 남은 수를 C로 나눔
                }
            }else cntC = (num % A) / C; // A로 나눈 나머지가 B보다 작으면 C로 나눔
        }else if (num >= B) {// 숫자가 B와 같거나 크면
            cntB = num / B; // 숫자를 B로 나눈 값 대입
            if((num % B) > 0){ // B로 나눈 나머지가 0보다 크면
                cntC = (num % B)/C; // C로 나눈 값 대입
            }
        }else cntC = num / C; // 숫자가 A,B보다 작으면 C로 나눈 값 대입

        if (num % C != 0) System.out.println(-1); // C로 나눈 나머지가 0이 아니면 정확하게 초를 맞출 수 없으므로 -1 출력
        else System.out.printf("%d %d %d\n",cntA,cntB,cntC); // 버튼 차례대로 출력
    }
}

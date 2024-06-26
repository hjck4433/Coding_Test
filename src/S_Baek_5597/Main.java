package S_Baek_5597;

//입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다.
// 출석번호에 중복은 없다.
// 출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고,
// 2번째 줄에선 그 다음 출석번호를 출력한다.

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];

        for(int i = 0; i < 28; i++){
            int n = sc.nextInt();
            arr[n-1] = 1;
        }

        int cnt = 0;
        for(int i =0; i < 30; i++){
            if (cnt == 2) break;
            if(arr[i] == 0) {
                System.out.println(i+1);
                cnt++;
            }
        }
    }
}

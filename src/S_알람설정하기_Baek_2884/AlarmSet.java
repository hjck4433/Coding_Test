package S_알람설정하기_Baek_2884;
import java.util.Scanner;
// 45분 일찍 알람 설정하기
// 나가야 할 시간 입력 하면 45분 전 시간이 나옴
// 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
// 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
// input 0 15
// Output 23H 30M
public class AlarmSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("외출할 시간 분 입력 : ");
        int h = sc.nextInt();
        int m = sc.nextInt();

        // 몫 나누기 사용 x 버전
//        if (m - 45 < 0) {
//            if (h == 0) h = 23;
//            else h -= 1;
//            m = 60 + (m-45);
//        }else {
//            m -= 45;
//        }
//        System.out.printf("%d시 %d분",h,m);

        // 몫 나누기 사용 버전
        int time = (h * 60 + m) - 45;

        if (time < 45) {
            time += 60 * 24;
        }
        h = time / 60;
        m = time % 60;

        System.out.printf("%d시 %d분",h,m);



    }
}

package S_윤년계산하기;
import java.util.Scanner;
// 연도가 4로 나누어 떨어 진다
// 100으로 나누어 떨어지면 연도는 윤년이 아니다.
// 400으로 나누어 떨어지면 윤년이다.
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력 : ");
        int year = sc.nextInt();

        if((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) System.out.println("윤년입니다.");
        else System.out.println("윤년이 아닙니다.");
    }
}

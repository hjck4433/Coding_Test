package S_정수나누어담기;
import java.util.Scanner;
// 100의 자리 정수를 입력 받아서 3개의 변수에 나누어 대입 하기
// input : 135
// output : 100의 자리 : 1, 10의 자리 : 3, 1의자리 : 5
public class IntSeperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 정수 입력 : ");
        int n = sc.nextInt();

        int x = n / 100;
        int y = (n % 100) / 10;
        int z = n % 10;

        System.out.printf("100의 자리 : %d, 10의자리 : %d, 1의자리 : %d", x, y, z);
    }
}

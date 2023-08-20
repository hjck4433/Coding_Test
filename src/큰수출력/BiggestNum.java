package 큰수출력;
import java.util.Scanner;
// 세자리의 정수를 입력 받아 가장 큰 수를 출력
// ex) Input 285 Output 8

public class BiggestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리의 정수를 입력 : ");
        int n = sc.nextInt();

        int x = n / 100;
        int y = (n % 100) / 10;
        int z = n % 10;

        int bigNum = 0;

        if(x > y) {
            bigNum = x > z ? x : z;
        }else if (x < y) {
            bigNum = y > z ? y : z;
        }


        System.out.println("각 자리중 가장 큰 수 : " + bigNum);

    }
}

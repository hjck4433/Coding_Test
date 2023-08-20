package 삼각별만들기;
import java.util.Scanner;
// 삼각형 별찍기
// 입력 받은 수만큼 별찍기
// Input : 5
// Output :
// *
// * *
// * * *
// * * * *
// * * * * *
public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        int n = sc.nextInt();
        int i = 1; // while문에만 사용

//        for (int i = 0; i < n ; i++) {
//            for(int j = i; j >= 0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        while(i <= n){
            for (int j = 0; j < i; j++) System.out.print("* ");
            i++;
            System.out.println();
        }
    }
}

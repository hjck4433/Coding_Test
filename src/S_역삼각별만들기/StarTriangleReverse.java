package S_역삼각별만들기;
import java.util.Scanner;
// Input: 5
// Output :
// * * * * *
// * * * *
// * * *
// * *
// *
public class StarTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();

//        for (int i = n; i >=0 ; i--){
//            for(int j = i; j >= 0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        while(n>0) {
            for (int i = n; i>=0; i--)System.out.print("* ");
            System.out.println();
            n--;
        }
    }
}

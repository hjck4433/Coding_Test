package S_Baek_2720;
// Quarter 0.25 / Dime 0.10 / Nickel 0.05 / Penny 0.01
// 500 이하
// input
// 3
//124
//25
//194
//output
//4 2 0 4
//1 0 0 0
//7 1 1 4
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = 25; int d = 10; int n = 5; int p = 1;

        int t = sc.nextInt();
        int[][] changeArr = new int[t][4];

        for(int i = 0; i < t ; i++){
            int change = sc.nextInt();
            changeArr[i][0] = change / q;
            if(change % q != 0) {
                changeArr[i][1] =  (change % q) / d;
                changeArr[i][2] = ((change - changeArr[i][0] * q )% d) / n;
            }
            changeArr[i][3] = change % n;
        }

        for(int i = 0; i < t ; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(changeArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

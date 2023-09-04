package S_Baek_2444;
import java.util.Scanner;
// 1 3 5 7 9 11 13 / 0/ 1/ 2/ 3/ 4/ 5/ 6  2n-1

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nLen = n+n-1; // 별의 최대 길이 + 출력될 줄의 수
        int cnt = 1; // 출력될 별의 수
        for(int i = 0; i < nLen ; i++) {
            for(int j = 0; j < nLen; j++) {
                if(j >= (nLen/2)-(cnt / 2) && j <= (nLen/2)+(cnt / 2)) System.out.print("*");
                else if(j < (nLen/2)-(cnt / 2)) System.out.print(" "); //별찍기전까지만 공백 출력
            }
            System.out.println();
            if(i >= n-1) cnt-=2; // 별의 수 2개씩 감소
            else cnt+=2; // 별의 수 2개씩 증가
        }
    }
}

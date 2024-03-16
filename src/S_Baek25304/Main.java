package S_Baek25304;

// 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
//둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N
//이후 N개의 줄에는 각 물건의 가격
//a와 개수 b가 공백을 사이에 두고 주어진다.
//구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다.
//일치하지 않는다면 No를 출력한다.

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        int total = 0;

        for(int i =0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            total += a * b;
        }

        if(total == x)System.out.println("Yes");
        else System.out.println("No");
    }
}

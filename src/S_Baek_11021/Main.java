package S_Baek_11021;

//각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다.
// 테스트 케이스 번호는 1부터 시작한다.

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] rst = new int[t];

        for(int i =0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            rst[i] = a+b;
        }

        for(int i = 0; i<t; i++){
            System.out.println("Case #"+(i+1)+": "+rst[i]);
        }
    }
}

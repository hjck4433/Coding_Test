package S_Baek_10950;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] rst = new int[t];

        for(int i =0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            rst[i] = a+b;
        }

        for(int rs: rst){
            System.out.println(rs);
        }
    }
}

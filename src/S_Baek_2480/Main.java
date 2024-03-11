package S_Baek_2480;

// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int rst= 0;

        if(a == b) {
            rst = a == c ? 10000 + (a * 1000) : 1000 + (a * 100);
        }else {
            if (a == c) {
                rst = 1000 + (a * 100);
            }else {
                if (b == c) {
                    rst = 1000 + (b * 100);
                }else {
                    int big = Math.max(a,b);
                    rst = big > c ? big * 100 : c * 100;
                }
            }
        }

        System.out.println(rst);

    }
}

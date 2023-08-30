package S_X보다작은수;
// 첫째줄에 N과 X가 주어 짐
// 첫줄: 10 5
// 둘째줄 : 1 10 4 9 2 3 8 5 7 6
// 결과 : 1 4 2 3

import java.util.Scanner;

public class SmallerThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int X = sc.nextInt();

        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num < X) System.out.print(num + " ");
        }
    }
}

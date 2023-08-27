package S_저항;

import java.util.Scanner;

// 저항 값 구하기 : 컬러 문자열 3개를 입력 받음
// 첫번째 컬러 문자열은 10의 자리 수
// 두번째 컬리 문자열은 1의 자리 수
// 세번째 컬러 문자열은 곱하는 수
// black 0 1
// brown 1 10
// red   2 100
// orange 3 1,000
// yellow 4 10,000
// green 5 100,000
// blue 6 1,000,000
// violet 7 10,000,000
// grey 8 100,000,000
// white 9 1,000,000,000
public class OhmEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
        long sum = 0;


        for(int i = 0; i < 3; i++) {
            String color = sc.next();
            int n = 0;
            for(int j = 0; j < colors.length; j++) {
                if(color.equalsIgnoreCase(colors[j])) n = j;
            }
            if(i < 2) sum += i == 0 ? n*10 : n;
            else sum *= (long) (Math.pow(10, n));
        }

        System.out.println(sum);


    }
}

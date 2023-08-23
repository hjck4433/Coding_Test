package S_계산기만들기;

import java.util.Scanner;

// input 3 * 5
// output 곱셈 : 15
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 연산자를 확인해서 덧셈/ 뻴셈/ 곱셈/ 나눗셈 을 구분
        System.out.print("정수 연산자 정수 입력 : ");
        int x = sc.nextInt();
        char op = sc.next().charAt(0);
        int y = sc.nextInt();

        switch(op) {
            case '+' :
                System.out.println("덧셈 : " + (x + y));
                break;
            case '-' :
                System.out.println("뺄셈 : " + (x-y));
                break;
            case '*':
            case 'x':
            case 'X':
                System.out.println("곱셈 : " + (x * y));
                break;
            case '/':
                while(y==0) {
                    System.out.print( y + "으로 나눌 수 없습니다 다시 입력하세요 : ");
                    y = sc.nextInt();
                }
                System.out.println("몫 : " + (x / y));
                break;
        }
    }
}

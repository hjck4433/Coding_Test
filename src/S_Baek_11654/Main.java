package S_Baek_11654;

// 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
// 입력으로 주어진 글자의 아스키 코드 값을 출력한다.

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println((int)str.charAt(0));
    }
}

package S_Baek_27866;

//첫째 줄에 영어 소문자와 대문자로만 이루어진 단어
//S가 주어진다. 단어의 길이는 최대
//1,000$이다.
//둘째 줄에 정수
//i가 주어진다.
// S 의 i번째 글자를 출력

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(str.charAt(n-1));
    }
}

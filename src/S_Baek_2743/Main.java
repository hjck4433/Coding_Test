package S_Baek_2743;

//첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
//첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.


import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(str.length());
    }
}

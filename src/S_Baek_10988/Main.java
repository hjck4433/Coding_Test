package S_Baek_10988;

import java.util.Scanner;
import java.util.Stack;

// level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
// 팰린드롬이면 1 / 아니면 0 출력
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> word = new Stack<>();
        String popWord = "";
        String input = sc.next();
        for(int i = 0; i < input.length(); i++) {
            word.push(input.charAt(i));
        }
        for(int i = 0; i < input.length(); i++) {
            popWord += word.pop();
        }
        System.out.println(popWord.equalsIgnoreCase(input) ? 1 : 0);
    }
}

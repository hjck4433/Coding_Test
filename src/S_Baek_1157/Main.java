package S_Baek_1157;

import java.util.Scanner;

// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
// Mississipi => ?
// baaa => A
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();
        int[] alpha = new int[26];
        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'A';
            alpha[idx] += 1;
        }
        int max_idx = 0;
        char rst = ' ';
        for (int i = 0; i < alpha.length; i++) {
            if(alpha[i] > alpha[max_idx]) {
                max_idx = i;
                rst = (char)('A' + i);
            }else if (alpha[i] == alpha[max_idx]) {
                if(i==0) rst = 'A';
                else rst = '?';
            }
        }
        System.out.print(rst);
    }
}

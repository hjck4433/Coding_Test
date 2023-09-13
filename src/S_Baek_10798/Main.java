package S_Baek_10798;
// 총 다섯줄의 입력이 주어진다. 각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다.
// 주어지는 글자는 영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’ 중 하나이다. 각 줄의 시작과 마지막에 빈칸은 없다.
// 영석이가 세로로 읽은 순서대로 글자들을 출력한다. 이때, 글자들을 공백 없이 연속해서 출력한다.
//ABCDE
//abcde
//01234
//FGHIJ
//fghij
// 출력 : Aa0FfBb1GgCc2HhDd3IiEe4Jj

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] wordArr = new String[5];
        int max = 0;
        for (int i =0; i < 5; i++) {
            wordArr[i] = sc.next();
            if (wordArr[i].length() > max) max = wordArr[i].length();
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (wordArr[j].length() <= i) System.out.print("");
                else {
                    System.out.print(wordArr[j].charAt(i));
                }
            }
        }
    }
}

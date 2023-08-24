package S_KMPEx;
import java.util.Scanner;
// Knuth-Morris-Pratt => KMP
// Mirko-Slovko => MS
// 방법 1 : Split("-")를 이용해서 문자열을 자르고 자른 문자열의 0번째 인덱스를 선택하는 방법
// 방법 2 : 0번째 선택, "-"다음의 첫번째 문자를 선택하는 방법
// 방법 3/4 : 대문자만 골라냄 (CharAt(인덱스), toCharArray())
public class KMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String name = sc.next();

        // 방법 1 Split("-")를 이용해서 문자열을 자르고 자른 문자열의 0번째 인덱스를 선택하는 방법
        System.out.print("방법 1 결과 : ");
        String[] names = name.split("-");
        for(String s : names) System.out.print(s.charAt(0));
        System.out.println();

        // 방법 2 0번째 선택, "-"다음의 첫번째 문자를 선택하는 방법
        System.out.print("방법 2 결과 : ");
        for (int i = 0; i < name.length(); i++) {
            if(i == 0) System.out.print(name.charAt(0));
            else if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
        }
        System.out.println();

        // 방법 3 대문자만 골라냄 (CharAt(인덱스))
        System.out.print("방법 3 결과 : ");
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >= 'A' && ch <= 'Z') System.out.print(ch);
        }
        System.out.println();

        // 방법 4 대문자만 골라냄 (toCharArray())
        System.out.print("방법 4 결과 : ");
        char[] chName = name.toCharArray();
        for (char c : chName) {
            if (c >= 'A' && c <= 'Z') System.out.print(c);
        }

    }
}

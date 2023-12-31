package S_대소문자바꾸기;
import java.util.Scanner;
// 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
// charAt(index) : 문자열에 해당 인덱스 문자를 추출
// toCharArray() : 문자열을 무자 배열로 변환
public class ChangeCharCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String word = sc.next();
        char[] alpha = word.toCharArray();
        final int btw = 'a' - 'A';

        for(int i = 0; i < alpha.length; i++) {
            if(alpha[i] < 'a') alpha[i] += btw;
            else alpha[i] -= btw;
        }

        for (int e : alpha) System.out.print((char) e);
    }
}

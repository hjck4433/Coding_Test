package S_문자열반전;
import java.util.Scanner;
// Input : abcd
// Output : dcba
public class CharReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.next();
        String strRev = "";
        int pos = str.length()-1;

        // for문 사용
        for(int i = pos; i >= 0; i-- ){
            strRev += str.charAt(i);
        }
        System.out.println(strRev);
        
        // while문 사용
        while(pos >= 0) {
            strRev += str.charAt(pos);
            pos--;
        }

        System.out.println(strRev);

    }
}

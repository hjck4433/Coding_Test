package S_암호;
import java.util.Scanner;
// 암호화 키 l o v e l o v e   l = 12번째 알파벳
// 평문     n i c e   d a y    n-12 = b
// 암호문   b t g z   o e t

// 첫 줄: 평문 / 둘째 줄 : 암호화 키
// 출력 암호문

public class VigenereCipher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 평문
        char[] origin = sc.nextLine().toCharArray(); // 평문을 담는 배열
        int originLen = origin.length; // 평문 길이

        // 암호화 키
        char[] encryptKey = sc.next().toCharArray(); // 암호화 키
        int[] alphaNum = new int[originLen]; // 알파벳 순서 넣는 배열
        for(int i = 0; i < originLen ; i++) {
            int n = i;
            if(i >= encryptKey.length) n = i % encryptKey.length;
            alphaNum[i] = 26 - ('z' - encryptKey[n]);
        }

        // 암호문
        char[] encrypt = new char[originLen];
        for (int i = 0; i <originLen ; i++) {
            if (origin[i] == ' ') {
                encrypt[i] = ' ';
            } else if(origin[i] - alphaNum[i] < 'a') {
                encrypt[i] = (char) (('z' + 1) - ('a' - (origin[i] - alphaNum[i])));
            } else encrypt[i] = (char) (origin[i] - alphaNum[i]);
        }

        //암호문 출력
        for (char enc : encrypt) System.out.print(enc);




    }
}

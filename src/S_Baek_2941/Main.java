package S_Baek_2941;

// 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
// 단어는 크로아티아 알파벳으로 이루어져 있다.
// 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
// 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt = 0;
        for(String st : arr) {
            while(str.contains(st)) {
                str = str.replaceFirst(st," ");
                cnt ++;
            }
        }
        str = str.replace(" ","");
        System.out.println(cnt + str.length());

    }
}

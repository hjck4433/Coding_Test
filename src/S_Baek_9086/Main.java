package S_Baek_9086;

// 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다.
// 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다.
// 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
// 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < t; i++){
            String str = bf.readLine();
            char start = str.charAt(0);
            char end = str.charAt(str.length()-1);
            bw.write(String.valueOf(start) + String.valueOf(end) + "\n");
        }
        bw.close();
    }
}

package S_Baek_2745;

// B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
// 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다.
// 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
//A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
// 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
// B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.
// 첫째 줄에 B진법 수 N을 10진법으로 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int sum = 0;

        for(int i = n.length()-1; i >= 0; i--) {
            char ch = n.charAt(i);
            if('0' <= ch && ch <= '9'){
                sum += (ch - '0') * tmp;
            }else {
                sum += (ch - 'A' + 10) * tmp;
            }
            tmp *= b;
        }

        br.close();
        System.out.println(sum);
    }
}

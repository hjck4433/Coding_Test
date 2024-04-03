package N_Baek_11005;

// 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
// 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다.
// 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
// A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
// 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.
// 첫째 줄에 10진법 수 N을 B진법으로 출력한다.

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        List<Character> ls = new ArrayList<>();

        while(n > 0){
            if(n % b < 10) {
                ls.add((char) (n % b + '0'));
            }else {
                int rst = n % b -10 + 'A';
                ls.add((char)rst);
            }
            n /= b;
        }

        for( int i = ls.size()-1; i >= 0; i--){
            System.out.print(ls.get(i));
        }
    }
}

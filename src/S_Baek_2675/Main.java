package S_Baek_2675;

// 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다.
// 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다.
// S의 길이는 적어도 1이며, 20글자를 넘지 않는다.

// 각 테스트 케이스에 대해 P를 출력한다.

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        for(int i = 0; i<t; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for(int j =0; j < s.length(); j++){
                bw.write(String.valueOf(s.charAt(j)).repeat(r));
            }
            bw.write("\n");
        }
        bw.close();

    }
}

package S_Baek_11022;

//각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
// x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());
        StringTokenizer st;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1; i<=t; i++){
            st = new StringTokenizer(bf.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
        }
        bw.close();

    }
}

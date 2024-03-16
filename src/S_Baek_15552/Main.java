package S_Baek_15552;

//각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
//BufferedReader/BufferedWriter 사용

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] rst = new int[t];

        for(int i = 0; i < t; i++){
            StringTokenizer st= new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            rst[i] = a+b;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int rs : rst) {
            bw.write(rs+"\n");
        }

        bw.close();
    }
}

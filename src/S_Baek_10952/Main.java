package S_Baek_10952;

//  여러 개의 테스트 케이스로 이루어져 있다.
//  각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//  입력의 마지막에는 0 두 개가 들어온다.
//  각 테스트 케이스마다 A+B를 출력한다.


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 1;
        while(i == 1){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a != 0 && b != 0)  bw.write(a+b + "\n");
            else i = 0;
        }

        bw.close();

    }
}

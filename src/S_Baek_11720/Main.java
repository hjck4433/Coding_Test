package S_Baek_11720;

// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
// 입력으로 주어진 숫자 N개의 합을 출력한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        int rst = 0;

        for(char ch : arr){
            rst += Integer.parseInt(String.valueOf(ch));
        }

        System.out.println(rst);
    }
}

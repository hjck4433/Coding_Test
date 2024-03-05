package S_Baek_2839;

// 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
// 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때,
// 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
// 상근이가 배달하는 봉지의 최소 개수를 출력한다.
// 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rst = 0;

        while(true) {
            if(n % 5 == 0){
                rst += n / 5;
                break;
            }

            n -= 3;
            rst ++;
            if(n < 0) {
                rst = -1;
                break;
            }
        }
        System.out.println(rst);

    }
}

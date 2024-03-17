package S_Baek_2439;

//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//         *
//        **
//       ***
//      ****
//     *****

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            System.out.println(" ".repeat(n-i)+"*".repeat(i));
        }
    }
}

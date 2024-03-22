package S_Baek_3052;

// 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다.
// 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
// 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[42];
        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            int n = a % 42;
            arr[n] = 1;
        }
        int rst = 0;
        for(int num : arr){
            rst+=num;
        }
        System.out.println(rst);
    }
}

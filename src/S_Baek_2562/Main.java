package S_Baek_2562;

// 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
// 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int idx = 0;

        for(int i = 0; i<9; i++){
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                idx = i+1;
            }
        }

        System.out.print(max + " " + idx);
    }
}

package S_Baek_10811;

// 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
// 둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다.
// 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다.
// (1 ≤ i ≤ j ≤ N)
// 도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.
// 모든 순서를 바꾼 다음에,
// 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i <n; i++){
            arr[i] = i+1;
            temp[i] = i+1;
        }

        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = 0; j<= b-a; j++){
                temp[(b-1)-j] = arr[(a-1)+j];
            }

            for (int k = 0; k < n; k++){
                arr[k]=temp[k];
            }
        }
        for(int num : arr){
            System.out.print(num +" ");
        }

    }
}

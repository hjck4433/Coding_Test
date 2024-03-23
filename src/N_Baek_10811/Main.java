package N_Baek_10811;

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

            if (a == b) return;

            for (int j = 0; j<= b-a; j++){
                temp[(b-1)-j] = arr[(a-1)+j];
            }

        }
        for(int num : temp){
            System.out.print(num +" ");
        }
    }
}

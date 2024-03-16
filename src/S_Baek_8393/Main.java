package S_Baek_8393;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rst = 0;
        for(int i = 1; i <= n; i++){
            rst+=i;
        }
        System.out.println(rst);
    }
}

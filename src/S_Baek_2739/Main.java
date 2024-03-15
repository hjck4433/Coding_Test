package S_Baek_2739;

//출력형식과 같게 N*1부터 N*9까지 출력한다.

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i < 10; i++){
            System.out.println(n + " * " + i + " = "+ (n*i));
        }
    }
}

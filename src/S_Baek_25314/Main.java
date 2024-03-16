package S_Baek_25314;

//4바이트마다 long 마지막 int
// ex 4 = long int
//혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < (n/4); i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}

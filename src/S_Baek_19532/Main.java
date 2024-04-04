package S_Baek_19532;

// ax + by = c
// dx + ey = f
// 정수 a~f까지 공백으로 구분되어 차례대로 주어질 때
// 만족하는 x, y를 공백으로 구분해 출력


import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int x = 0;
        int y = 0;

        for(int i = -999; i < 1000; i++){
            for(int j =-999; j < 1000; j++) {
                if((a*i+b*j==c) && (d*i+e*j==f)){
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        System.out.println(x + " "+y);
    }
}

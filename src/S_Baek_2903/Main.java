package S_Baek_2903;
// 1 => 9 // 5 => 1089
// 1 ... 3 // 2 ... 5 // 3 ... 9 // 4 ... 17 // 5 ... 33 // 6 ... 65
// +2 // +3 // +6 // +13 // +28 // + 59

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dot = 2;
        for(int i = 1; i <= n ; i++) {
            dot = (dot * 2) - 1;
        }
        System.out.println(dot * dot);
    }
}

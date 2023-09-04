package S_Baek_3003;

import java.util.Scanner;

// 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
// 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
// 첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력
//  만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.
// 입력 : 0 1 2 2 2 7 출력 : 1 0 0 0 0 1
// 입력 : 2 1 2 1 2 1 출력 : -1 0 0 1 0 7
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 1, 2, 2, 2, 8};
        int[] arr2 = new int[6];

        for(int i = 0; i < 6; i++) {
            int num = sc.nextInt();
            if(num == arr[i]) num = 0;
            else num = arr[i] - num;
            arr2[i] = num;
        }
        for(int e : arr2) System.out.print(e + " ");

    }
}

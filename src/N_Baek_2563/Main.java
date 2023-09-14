package N_Baek_2563;

import java.util.Scanner;

// 첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다.
// 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고,
// 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. 색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다
// 첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.
// 3
// 3 7  13 17
// 15 7 25 17    10 - (25 - 15) = 0 / 10 - (17 - 12) = 5
// 5 2  15 12    10-(15-13) = 8 /
// 출력 : 260

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n * 100;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n ; i++) {
            arr[i][0] = sc.nextInt() + 10;
            arr[i][1] = sc.nextInt() + 10;
        }

    }
}

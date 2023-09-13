package S_Baek_2566;
// 9* 9 만큼 수 입력
// 최대값 / 최대값 행 열

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] numBoard = new int[9][9];

        int MaxCol = 0;
        int MaxRow = 0;
        int MaxNum = 0;
        for(int i =0; i < 9; i++) {
            for (int j = 0; j < 9; j++){
                int num = sc.nextInt();
                if (i == 0 && j == 0) MaxNum = num;
                numBoard[i][j] = num;
                if (numBoard[i][j] >= MaxNum) {
                    MaxNum = numBoard[i][j];
                    MaxCol = i+1;
                    MaxRow = j+1;
                }
            }
        }
        System.out.println(MaxNum);
        System.out.println(MaxCol +" "+ MaxRow);
    }
}

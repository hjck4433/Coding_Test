package S_Baek_2738;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int cntInput = 0;

        int idxN = 0;
        int idxM = 0;

        while (true) {
            int num = sc.nextInt();
            if (idxM == m) {
                idxM = 0;
                idxN ++;
            }
            if (cntInput < n * m) {
                a[idxN][idxM] = num;
                idxM++;
                if (cntInput == (n*m)-1) {
                    idxN = 0;
                    idxM = 0;
                }
            }else {
                b[idxN][idxM] = num;
                idxM++;
            }
            cntInput++;
            if (cntInput == (n * m) * 2) break;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }

    }
}

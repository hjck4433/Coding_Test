package N_Baek_1316;
// 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면,
// ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
// aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
//3 happy new year => 3

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            int prevIdx = 0;
            int idx = 0;
            for(int j = 0; j < word.length(); j++) {
                String str = Character.toString(word.charAt(j));
                prevIdx = j;
                for(int k = 1; k < word.length(); k++) {
                    String str2 = Character.toString(word.charAt(k));
                    idx = k;
                    if(str.equals(str2)) {
                        if (idx - prevIdx == 1) {
                            str = Character.toString(word.charAt(k));
                            prevIdx = k;
                        }else if (idx - prevIdx > 1) break;
                    }

                }
            }
            if (idx - prevIdx == 1) cnt++;
        }
        System.out.println(cnt);


    }
}

/*aba
abab
abcabc
a*/
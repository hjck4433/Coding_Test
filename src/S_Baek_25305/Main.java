package S_Baek_25305;
// 응시자수 N / 상을 받는 사람 수 K
// 응시자 수 만큼 점수 x
// 출력: 커트라인


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> xlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            xlist.add(sc.nextInt());
        }
        xlist.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(xlist.get(k-1));

    }
}

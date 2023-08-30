package S_홀수짝수나누어담기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenList {
    List<Integer> list = new ArrayList<>();
    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();
    public void inputAndDiv() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            if(num % 2 == 0) even.add(num);
            else odd.add(num);
            list.add(num);
        }
    }
    public void outPutEvenOdd() {
        System.out.print("홀수 : ");
        for(Integer e : odd) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(Integer e : even) System.out.print(e + " ");
        System.out.println();
    }
    public void outPutEvenOdd2() {
        System.out.print("홀수 : ");
        list.stream().filter(n-> n % 2 !=0).forEach(e-> System.out.print(e + " "));
        System.out.println();
        System.out.print("짝수 : ");
        list.stream().filter(n-> n % 2 ==0).forEach(e-> System.out.print(e + " "));
        System.out.println();
    }
}

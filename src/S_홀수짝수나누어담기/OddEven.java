package S_홀수짝수나누어담기;


import java.util.Scanner;

public class OddEven {
    int[] nums = new int[7];
    //int[] even = new int[7];
    //int[] odd = new int[7];
    int[] even;
    int[] odd;
    int eIdx = 0;
    int oIdx = 0;

    public void inputNums() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
            nums[i] = sc.nextInt();
            if(nums[i] % 2 == 0) eIdx++;
            else oIdx++;
        }
        this.even = new int [eIdx];
        this.odd = new int [oIdx];
    }

    public void evenOddCalc() {
//        for(int i : nums) {
//            if (i % 2 == 0) even[eIdx++] = i;
//            else odd[oIdx++] = i;
//        }
        for(int i : nums) {
            if (i % 2 == 0) even[--eIdx] = i;
            else odd[--oIdx] = i;
        }
    }

    public void evenOddOutput() {
        System.out.print("홀수 : ");
        //for(int i = 0; i < oIdx ; i++) System.out.print(odd[i] + " ");
        for(int i = odd.length-1 ; i >= 0 ; i--) System.out.print(odd[i] + " ");
        System.out.println();
        System.out.print("짝수 : ");
        //for(int i = 0; i < eIdx ; i++) System.out.print(even[i] + " ");
        for(int i = even.length-1; i >= 0 ; i--) System.out.print(even[i] + " ");
        System.out.println();
    }
}

package S_집주소;

// 1 = 2 / 2...9 = 3 / 0 = 4
// 숫자를 입력
// 해당숫자의 몇 칸을 차지하는 지를 출력하는 문제
// 0을 입력하면 종료
// 120 = 13 / 5611 = 15 / 100 = 14
import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] addrArr;
        String addrNum = "";

        System.out.print("숫자 입력 : ");
        while(true) {
            String num = sc.next();
            if(num.equals("0")) break;
            addrNum += num + ",";
        }
        addrArr = addrNum.split(",");
        int[] numsArr = new int[addrArr.length];
        for(int i = 0; i < addrArr.length; i++) {
            int sum = 1;
            for(int j = 0; j < addrArr[i].length(); j++) {
                char[] ch = addrArr[i].toCharArray();
                if(ch[j] == '1') sum += 3;
                else if (ch[j] == '0') sum += 5;
                else sum += 4;
            }
            numsArr[i] = sum;
        }

        for(int e : numsArr) System.out.println(e);

    }
}

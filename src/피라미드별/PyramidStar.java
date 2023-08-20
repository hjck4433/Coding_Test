package 피라미드별;
import java.util.Scanner;
// input : 5
// output:                    필요 공백
//        ________*________   1칸  1
//              *_*_*         5칸  2 2n+1
//            *_*_*_*_*       9칸  3 3n(n-3)
//          *_*_*_*_*_*_*     13칸 4 3n+(n-3)
//        *_*_*_*_*_*_*_*_*   17칸 5 3n+(n-3)
public class PyramidStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String star = "*";
        int blank = 5;

        while(true){
            System.out.print("줄 수 입력 : ");
            n = sc.nextInt();
            if (n > 1) break;
            System.out.println("2이상의 값을 입력해주세요!");
        }

        if (n > 2) blank = ((3 * n) + (n-3)) / 2;

        for (int i = 0; i < n ; i++) {
            System.out.println("|" + " ".repeat(blank) + star + " ".repeat(blank) + "|");
            star = "* " + star + " *";
            blank-= 2;
        }
    }
}

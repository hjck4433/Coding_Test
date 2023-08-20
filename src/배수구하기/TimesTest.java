package 배수구하기;
// 1 ~ 1000사이의 7의 배수를 구하고 한줄에 10개 항목씩 출력 하기
public class TimesTest {
    public static void main(String[] args) {
        for(int i = 0; i <= 1000 ; i++) {
            if(i % 7 == 0) System.out.printf("%4d",i);
            if(i % 70 == 0) System.out.println();
        }
    }
}

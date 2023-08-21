package 상근날드;
import java.util.Scanner;
// 문제 요약 : 햄버거 3개와 음료 2개를 연속으로 입력 받아, 햄버거 중 가장 작은 값, 음료 2개 중 작은 값을 찾음
// 작은 값을 더하고 세트 메뉴 이기 때문에 50원 빼서 금액을 구함
// 150 ~ 2000 가격 범위
public class BurgerSetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menuName = {"상근버거", "중근버거", "하근버거", "콜라", "사이다"};
        int[] menuPrice = new int[5];

        for (int i = 0; i < menuPrice.length; i++) {
            while (true) {
                System.out.printf("%s 가격 : ", menuName[i]);
                int price = sc.nextInt();
                if (price < 150 || price > 2000) System.out.println("100 이상 2000 이하의 가격을 입력하세요.");
                else {
                    menuPrice[i] = price;
                    break;
                }
            }
        }
        int cheapBurger = menuPrice[0];
        for(int i = 0; i < 3; i++){
            if( menuPrice[i] < cheapBurger) cheapBurger = menuPrice[i];
        }
        int cheapDrink = menuPrice[3] < menuPrice[4] ? menuPrice[3] : menuPrice[4];

        System.out.println("가장 저렴한 세트 : " + (cheapBurger + cheapDrink - 50));
    }
}
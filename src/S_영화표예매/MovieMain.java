package S_영화표예매;
// 간단한 영화 예매 시스템에 대한 예제 입니다
// 사용자 극장의 좌석을 선택, 판매된 좌석의 개수 만큼 판매금액 계산
// 1. 예매하기와 종료하기 메뉴 만들기 (종료하기를 선택 시 총 판매 금액을 계산함)
// 2. 극장의 좌석은 10개
// 3. 각 좌석당 금액은 12000원

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("티켓을 예매 하시겠습니까? [1]예매하기 [2]종료하기 : ");
        int reserve = sc.nextInt();
        boolean isBuy = reserve == 1;
        MovieTicket movieTicket = new MovieTicket(isBuy,12000);
        movieTicket.getBuy(reserve);
        while(movieTicket.isBuy()) {
            movieTicket.showSeat();
            System.out.print("원하시는 자리를 선택하세요 : ");
            int selSeat = sc.nextInt();
            movieTicket.selTicket(selSeat);
            System.out.print("티켓을 예매 하시겠습니까? [1]예매하기 [2]종료하기 : ");
            reserve = sc.nextInt();
            movieTicket.getBuy(reserve);
        }
    }

}

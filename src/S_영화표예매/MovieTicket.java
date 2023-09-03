package S_영화표예매;

public class MovieTicket {
    private String[] seats = {"[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]","[]"};
    private int price;
    private int totalP;
    private boolean isBuy;
    MovieTicket(boolean isBuy, int price) {
        this.price = price;
        this.isBuy = isBuy;
    }
    public void showSeat() {
        for(String e : seats) System.out.print(e + " ");
        System.out.println();
    }
    public void getBuy(int buy) {
        if(buy == 1) isBuy = true;
        else {
            isBuy = false;
            System.out.println("총 티켓 금액 : " + totalP);
        }
    }
    public boolean isBuy () {
        return isBuy;
    }
    public void selTicket(int sel) {
        if(seats[sel-1] != "[X]") {
            seats[sel-1] = "[X]";
            totalP += price;
        }
        else System.out.println("이미 예매된 좌석입니다.");
    }
}

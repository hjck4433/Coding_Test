package S_블루마블;
// 두개의 주사위를 던져 12가 나오면 탈출하는 게임

public class RandomGame {
    public static void main(String[] args) {
        int cnt = 0;
        while(true) {
            cnt++;
            int dice1 = (int)(Math.random() * 6)+1;
            int dice2 = (int)(Math.random() * 6)+1;
            
            if(dice1+dice2 == 12) break;
        }
        System.out.printf("%d 만에 탈출 성공",cnt);

    }
}

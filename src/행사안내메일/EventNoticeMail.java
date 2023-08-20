package 행사안내메일;
import java.util.Scanner;
//사용자로부터 이름, 제목, 날짜(20230817), 시간(17) 정보를 입력받습니다.
//입력된 날짜의 월을 추출하여 해당하는 계절을 판단합니다.
//계절에 따라 적절한 인사말과 입력된 일정 정보를 출력합니다.

//- 12월, 1월, 2월 → "한파의 연속인 1월 입니다."
//        - 3월 → "봄의 기운이 느껴지는 3월 입니다."
//        - 4월 → "새싹이 피어나는 4월 입니다."
//        - 5월 → "계절의 여왕 5월 입니다."
//        - 6월 → "활동하기 좋은 6월 입니다."
//        - 7월 → "휴가가 기다려지는 7월 입니다."
//        - 8월 → "무더운 8월 입니다."
//        - 9월 → "선선한 9월 입니다."
//        - 10월 → "천고마비의 계절 10월 입니다."
//        - 11월 → "쓸쓸한 늦가을 11월 입니다."

//        Output
//        [이름]님.
//        [계절 정보]
//        아래와 일정으로 [제목]를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.
//
//        ===== 행사 안내 =====
//        행사 안내 : [제목]
//        일시 : [년]년 [월]월 [일]일
//        시간 : [시간]시

public class EventNoticeMail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 이름
        System.out.print("이름 : ");
        String name = sc.nextLine();
        // 제목
        System.out.print("제목 : ");
        String title = sc.nextLine();
        //날짜
        System.out.print("날짜 : ");
        String date = sc.next();
        //시간
        System.out.print("시간 : ");
        int time = sc.nextInt();

        String year = date.substring(0,4);
        String month = date.substring(4,6);
        String day = date.substring(6,8);
        String season = "";

        switch(month) {
            case "01" :
            case "02" :
                season = "한파의 연속인 " + month.charAt(1) + "월 입니다.";
                break;
            case "03":
                season = "봄의 기운이 느껴지는 3월 입니다.";
                break;
            case "04":
                season = "새싹이 피어나는 4월 입니다.";
                break;
            case "05":
                season = "계절의 여왕 5월 입니다.";
                break;
            case "06":
                season = "활동하기 좋은 6월 입니다.";
                break;
            case "07":
                season = "휴가가 기다려지는 7월 입니다.";
                break;
            case "08":
                season = "무더운 8월 입니다.";
                break;
            case "09":
                season = "선선한 9월 입니다.";
                break;
            case "10":
                season = "천고마비의 계절 10월 입니다.";
                break;
            case "11":
                season = "쓸쓸한 늦가을 11월 입니다.";
                break;
            case "12":
                season = "한파의 연속인 12 월 입니다.";
                break;
        }


        System.out.println(name + "님.");
        System.out.println(season);
        System.out.printf("아래와 일정으로 %s를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.\n\n",title);
        System.out.println("=".repeat(5) + " 행사 안내 " + "=".repeat(5));
        System.out.println("행사 안내 : " + title);
        System.out.printf("일시 : %s년 %s월 %s일\n" ,year, month, day);
        System.out.printf("시간 : %d시",time);


    }
}

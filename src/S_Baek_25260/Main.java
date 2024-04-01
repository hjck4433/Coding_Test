package S_Baek_25260;

// 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
// 치훈이의 전공평점을 출력한다

import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        Map<String, Double> score = new HashMap<>();
        score.put("A+",4.5);
        score.put("A0",4.0);
        score.put("B+",3.5);
        score.put("B0",3.0);
        score.put("C+",2.5);
        score.put("C0",2.0);
        score.put("D+",1.5);
        score.put("D0",1.0);
        score.put("F",0.0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double creditSum = 0.0;
        double scoreSum = 0.0;

        String str;

        while((str = br.readLine()) != null){
            st = new StringTokenizer(str, " ");
            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if(!Objects.equals(grade, "P")) {
                creditSum += credit;
                scoreSum += credit * score.get(grade);
            }
        }

        br.close();

        System.out.println(scoreSum/creditSum);
    }
}

package S_학생성적정렬하기;
// 미리 입력 받아 놓고 시작
// 5명의 학생에 대해 이름과 성적을 입력 성적이 높은 사람 순으로 정렬하고 성적이 같으면 이름 순으로 정렬

import java.util.*;

public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<Student> stList = new TreeSet<>(); // 학생 정보를 담을 HashSet
        stList.add(new Student("설햄찌", 99));
        stList.add(new Student("레모니", 100));
        stList.add(new Student("구기린", 88));
        stList.add(new Student("이토끼", 88));
        stList.add(new Student("멍당근", 77));


        for(Student e : stList) System.out.println(e.name + ", " + e.score );

    }
}
class Student implements Comparable<Student> {
    String name; // 이름
    int score; // 성적

    //생성자
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score < o.score) return 1; // 내림차순
        else if(this.score == o.score) { // 성적이 같으면
            return this.name.compareTo(o.name); // 사전 순
        }else return -1; // 그 외에는 변화 없음
    }
}

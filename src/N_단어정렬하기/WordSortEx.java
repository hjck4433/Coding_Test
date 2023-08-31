package N_단어정렬하기;
// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
// n의 개수를 입력 먼저 입력 받음
//1. 길이가 짧은 것부터
//2. 길이가 같으면 사전 순으로
//3. 중복 제거

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSortEx {
    // comparator hasset hashmap 차이?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt(); // 단어의 개수
        TreeSet<Word> words = new TreeSet<>(new CompareWord());

        for(int i = 0; i < n ; i++) { // n의 수 만큼
            words.add(new Word(sc.next())); // HashSet에 추가
        }

        for(Word e: words) System.out.print(e.words + " ");
    }
}
class Word {
    String words;
    Word(String words) {
        this.words = words;
    }
}

class CompareWord implements Comparator<Word> {

    @Override
    public int compare(Word o1, Word o2) {
        if(o1.words.length() > o2.words.length()) return 1;
        else if (o1.words.length() == o2.words.length()) {
            return o1.words.compareTo(o2.words);
        }else return -1;
    }
}
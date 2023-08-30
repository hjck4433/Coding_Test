package S_홀수짝수나누어담기;

// 7개의 정수를 입력 받음
// 홀수와 짝수 배열로 나누어 담는 함수 만들기
// 홀수와 짝수를 출력하는 함수 만들기
// 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6
// 클래스를 생성해서 만들기

public class OddEvenArray {
    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        oddEven.inputNums();
        oddEven.evenOddCalc();
        oddEven.evenOddOutput();

        OddEvenList oddEvenList = new OddEvenList();
        oddEvenList.inputAndDiv();
        oddEvenList.outPutEvenOdd();
        oddEvenList.outPutEvenOdd2();

    }
}

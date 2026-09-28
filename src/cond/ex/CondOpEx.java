package cond.ex;

public class CondOpEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b; //a : b a위치는 참일때 출력 b는 거짓일때 출력
        // ? 는 a > b 이면? max는 변수이름 최댓값을 저장하는 변수라는 의미로 자주 사용됨
        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}

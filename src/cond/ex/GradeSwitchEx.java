package cond.ex;

public class GradeSwitchEx {

    public static void main(String[] args) {
        char grade = 'G' ; //char는 문자의 줄임말 글짜 딱 하나 String은 글자 여러개(문자열)

        switch (grade) {
            case 'A':
                System.out.println("탁월한 성과입니다!");
                break;
            case 'B':
                System.out.println("좋은 성과입니다!");
                break;
            case 'C':
                System.out.println("준수한 성과입니다!");
                break;
            case 'D':
                System.out.println("향상이 필요합니다");
                break;
            case 'F':
                System.out.println("불합격입니다");
                break;
            default: //default는 switch문에서 일치하는 case 가 없을 때 실행할 코드
                System.out.println("잘못된 학점입니다");
            }
        }
    }


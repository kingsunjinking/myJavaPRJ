import java.util.Scanner;

public class Quiz240403 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);      //처음값을 입력받기 위한 스캐너

        System.out.println("정수를 입력하세요");    //정수 입력 받기 전 메세지 출력
        int a = s.nextInt();                     //정수 입력 받는 변수 a 생성

        if (a % 21 == 0){       // 조건 지정
            System.out.println("3의 배수, 7의 배수 모두 만족합니다");  // 입력한 값을 21로 나눈 나머지가 0일경우 3의 배수 7의 배수
        }                                                         // 전부 만족하기 때문에 메세지 출력

        else if(a % 3 == 0){    // 위의 조건이 만족하지 않을 경우 다른 조건 지정
            System.out.println("3의 배수입니다");                   // 입력한 값을 3으로 나눈 나머지가 0일 경우 메세지 출력
        }

        else if(a % 7 == 0){    // 위의 조건이 만족하지 않을 경우 다른 조건 지정
            System.out.println("7의 배수입니다");                   // 입력한 값을 7로 나눈 나머지가 0일 경우 메세지 출력
        }

        else{                   //위의 모든 조건 충족하지 않을 시
            System.out.println("3의 배수, 7의 배수 둘 다 아닙니다");  // 입력한 값이 3의 배수 7의 배수 둘 다 아니므로 메세지 출력
        }
    }
}

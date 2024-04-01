import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int a = s.nextInt();

        if (a % 3 == 0 && a % 5 == 0){
            System.out.println("3의 배수, 5의 배수 모두 만족합니다");
        }

        else if(a % 3 == 0){
            System.out.println("3의 배수입니다");
        }

        else if(a % 5 == 0){
            System.out.println("5의 배수입니다");
        }

        else{
            System.out.println("3의 배수, 5의 배수 둘 다 아닙니다");
        }
    }
}

import java.util.Scanner;

public class Code05_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("정수 입력");
        int a = s.nextInt();

        if(a%2==0){
            System.out.println("짝수입니다");
        }
        else {
            System.out.println("홀수입니다");
        }
    }
}

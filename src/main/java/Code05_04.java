import java.util.Scanner;

public class Code05_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수를 입력하세요");

        int num = s.nextInt();

        if(num < 100){
            System.out.println("100보다 작고");
            System.out.println("문장 2개 출력");
        }
        else if(num == 100){
            System.out.println("100이랑 같고");
            System.out.println("문장 2개 출력");
        }
        else if(num > 100){
            System.out.println("100보다 크고");
            System.out.println("문장 2개 출력");
        }

    }
}

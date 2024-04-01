import java.util.Scanner;

public class Code05_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1~3까지 입력하세요");
        int select = s.nextInt();

        switch(select){

            case 1 :
                System.out.println("1을 선택했습니다");
                break;

            case 2 :
                System.out.println("2를 선택했습니다");
                break;

            case 3 :
                System.out.println("3을 선택했습니다");
                break;

            default:
                System.out.println("잘못된 값을 입력했습니다");
        }
    }
}

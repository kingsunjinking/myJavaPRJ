import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.print("정수를 입력하세요");

        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int i;
            if (num % 2 == 0) {
                for (i = 1; i <= num / 2 + 1; i++) {
                    for (int q = num / 2 + 1; q > i; q--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                    }
                System.out.println();
            }
                System.out.print("짝수는 안돼서 1을 더했습니다.");}
            if (num % 2 != 0) {
                for (i = 1; i <= (num + 1) / 2; i++) {
                    for (int q = (num + 1) / 2; q > i; q--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                    }
                System.out.println();
            }
        }
    }
}





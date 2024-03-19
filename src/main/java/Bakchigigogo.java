import java.util.Scanner;

public class Bakchigigogo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;

        System.out.print("몇개짜리 삼각형을 만들까요? : ");

        num = s.nextInt();

        s.close();
        {
            for (int i = 1; i <= num*2-1; i++) {
                if (i <= num) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                if (i > num) {
                    for (int j = num*2; j > i; j--) {
                        System.out.print("*");
                    }
                }System.out.println();
            }
        }

    }
}
import java.util.Scanner;

public class Baek1934 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 0; i < a; i++) {
        int b = s.nextInt(); int c =s.nextInt();
        int d = 0;
            if(b>c) {
                for (int j = b; j > 0; j--) {
                    if (b % j == 0 && c % j == 0) {
                        d = j;
                        break;
                    }
                }
            }
            else if(c>=b) {
                for (int j = c; j > 0; j--) {
                    if (b % j == 0 && c % j == 0) {
                        d = j;
                        break;
                    }
                }
            }
            System.out.println(b*c/d);
        }
    }
}

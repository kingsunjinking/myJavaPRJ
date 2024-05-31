import java.util.Scanner;

public class Baek1673 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = a / b;
            int d = c;
            while (a != 0) {
                if (d >= b) {
                    c += d / b;
                    d = d / b;
                } else if (d < b) {
                    break;
                }
            }
            System.out.println(a + c);
        }
    }
}

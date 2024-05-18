import java.util.Scanner;

public class Baek2441 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = a-i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

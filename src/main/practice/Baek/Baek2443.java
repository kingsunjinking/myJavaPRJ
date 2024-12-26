import java.util.Scanner;

public class Baek2443 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = a*2; j > i*2+1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
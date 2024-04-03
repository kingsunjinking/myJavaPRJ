import java.util.Scanner;

public class Baek2438 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for(int i=1; i <=a; i++) {
            System.out.print("");
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }System.out.println();
        }
    }
}

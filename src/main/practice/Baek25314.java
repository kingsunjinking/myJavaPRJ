import java.util.Scanner;

public class Baek25314 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 1; i*4 <= n; i++) {
            System.out.print("long ");
        }System.out.print("int");
    }
}

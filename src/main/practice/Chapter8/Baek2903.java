import java.util.Scanner;

public class Baek2903 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        System.out.println((int)Math.pow(((int)Math.pow(2,a)+1),2));
    }
}

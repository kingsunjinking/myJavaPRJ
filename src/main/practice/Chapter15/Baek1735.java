import java.util.Scanner;

public class Baek1735 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); int b = s.nextInt();
        int c = s.nextInt(); int d = s.nextInt();

        System.out.println(((a*d)+(c*b))+ " " +(b*d));
    }
}

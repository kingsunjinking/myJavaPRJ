import java.util.Scanner;

public class Baek2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        String b = s.next();

        int q = Integer.parseInt(String.valueOf(b.charAt(2)));
        int w = Integer.parseInt(String.valueOf(b.charAt(1)));
        int e = Integer.parseInt(String.valueOf(b.charAt(0)));
        int r = Integer.parseInt(b);

        System.out.println(a*q);
        System.out.println(a*w);
        System.out.println(a*e);
        System.out.println(a*r);

    }
}

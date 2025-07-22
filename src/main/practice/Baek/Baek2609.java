import java.util.Scanner;

public class Baek2609 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int gcd = 0;

        int max = Math.max(a,b);
        int min = Math.min(a,b);

        while( max % min != 0){
            gcd = max % min;
            max = min;
            min = gcd;
        }

        System.out.println(min);
        System.out.println(a * b / min);
    }
}

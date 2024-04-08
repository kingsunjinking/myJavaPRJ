import java.util.Scanner;

public class Baek2480 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt(); int b = s.nextInt(); int c = s.nextInt();

        int max = Math.max(a,Math.max(b,c));
        if (a == b && b == c && a==c) {
            System.out.print(10000 + a * 1000);
        }
        else if (a == b || a == c ){
            System.out.print(1000+a * 100 );
        }
        else if (b ==c){
            System.out.print(1000 + b * 100);
        }
        else {
            System.out.print(max*100);
        }
    }
}

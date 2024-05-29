import java.util.Scanner;

public class Baek2033 {                     //못품
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextInt();
        long b = 100000000;

        if(a < 10){
            System.out.println(a);
        }
        else {
        while (true) {
            if (a % b == a) {
                b = b / 10;
            } else {
                if (a % b > (b / 2) - (b / 10)) {
                    System.out.println(((a / b) + 1) * b);
                    break;
                } else {
                    System.out.println((a / b) * b);
                    break;
                }
            }
        }
        }
    }
}

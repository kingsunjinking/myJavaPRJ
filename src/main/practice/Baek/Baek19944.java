import java.util.Scanner;

public class Baek19944 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        if(m == 1 || m == 2){
            System.out.println("NEWBIE!");
        } else if (m <= n) {
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TLE!");
        }
    }
}

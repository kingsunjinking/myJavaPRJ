import java.util.Scanner;

public class Baek1009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for (int i = 0; i < a; i++) {
            int b = s.nextInt();
            int c = s.nextInt();

            int d = c%4;

            if(d == 0){
                d = 4;
            }

            int ans = (int) (Math.pow(b,d) % 10);
            if(ans == 0){
                System.out.println(10);
            }
            else {
                System.out.println(ans);
            }
        }
    }
}

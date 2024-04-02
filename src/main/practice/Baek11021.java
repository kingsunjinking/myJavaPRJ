import java.util.Scanner;

public class Baek11021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i = 1; i<=t; i++){
            int a= s.nextInt(); int b=s.nextInt();
            System.out.println("Case #" + i + ": " +(a+b));
        }
    }
}

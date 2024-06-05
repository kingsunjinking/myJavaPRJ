import java.util.Scanner;

public class Baek1357 {
    public static int Rev(int x) {
        if (x >= 100 && x < 1000) {
            int a = x / 100;
            int b = (x % 100) / 10;
            int c = (x % 100) % 10;
            int d = (c * 100) + (b * 10) + a;
            return d;
        } else if (x < 100 && x >= 10) {
            int a = x / 10;
            int b = x % 10;
            int c = (b*10) + a;
            return c;
        } else if (x >= 1000) {
            int a = x / 1000;
            int b = (x % 1000) / 100;
            int c = ((x % 1000) % 100)/10;
            int d = ((x % 1000) % 100) % 10;
            int e = (d*1000) + (c*100) + (b*10) + a;
            return e;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int num2 = s.nextInt();
        int aa = Rev(Rev(num2)+Rev(num));
        System.out.println(aa);
    }
}

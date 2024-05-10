import java.util.Scanner;

public class Baek2292 {                 //벌집
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = 6;
        int c = 2;
        int d = 8;
        int count = 2;
        if(a == 1){
            System.out.println("1");
        }
        else {
            for (int i = 1; i <= a; i++) {
                if (i == d) {
                    count++;
                    d = d + b * c;
                    c++;
                }
            }
            System.out.println(count);
        }
    }
}

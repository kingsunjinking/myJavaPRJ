import java.util.Scanner;

public class Baek1110 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count = 0;
        if(a < 10){
            a = a * 10;
        }
        int b = a;
        while (true){
            int c = (b/10) + (b%10);
            int d = (b%10*10) + (c%10);
            b = d;
            count++;
            if (d == a){
                break;
            }
        }

        System.out.println(count);
    }
}

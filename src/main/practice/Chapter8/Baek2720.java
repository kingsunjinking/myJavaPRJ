import java.util.Scanner;

public class Baek2720 {                     //거스름돈 구하기
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 0; i < a; i++) {
            int b = s.nextInt();
            System.out.print(b/25+" ");
            int c = b%25;
            System.out.print(c/10 +" ");
            int d = c%10;
            System.out.print(d/5+" ");
            int e = d%5;
            System.out.println(e/1 +" ");
        }
    }
}

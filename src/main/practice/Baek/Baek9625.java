import java.util.Scanner;

public class Baek9625 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int acnt = 1;
        int bcnt = 0;
        for (int i = 0; i < a; i++) {
            int tmp = acnt;
            acnt = bcnt;
            bcnt+=tmp;
        }

        System.out.println(acnt + " " + bcnt);
    }
}

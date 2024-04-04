import java.util.Scanner;

public class Baek9086 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 1; i <= a; i++) {
            String str = s.next();
            String upper = str.toUpperCase();
            char q = upper.charAt(0);
            char w = upper.charAt(str.length()-1);
            System.out.print(q);
            System.out.println(w);
        }
    }
}

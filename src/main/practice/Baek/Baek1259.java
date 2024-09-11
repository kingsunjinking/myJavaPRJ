import java.util.Scanner;

public class Baek1259 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int a = s.nextInt();
            int x = 0;
            String b = "";
            String str = Integer.toString(a);
            for (int i = str.length(); i > 0; i--) {
                b += String.valueOf(str.charAt(i - 1));
            }
            x = Integer.parseInt(b);
            if (a == 0) {
                break;
            } else if (x == a) {
                System.out.println("yes");
            } else if (x != a) {
                System.out.println("no");
            }
        }
    }
}

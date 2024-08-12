import java.util.Scanner;

public class Baek1225 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();
        long c = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                char d = a.charAt(i);
                char e = b.charAt(j);

                c += Integer.parseInt(String.valueOf(d)) * Integer.parseInt(String.valueOf(e));
            }
        }

        System.out.println(c);
    }
}

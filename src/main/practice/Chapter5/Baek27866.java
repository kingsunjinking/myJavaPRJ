import java.util.Scanner;

public class Baek27866 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int b = s.nextInt();

        System.out.println(a.substring(b-1,b));
    }
}

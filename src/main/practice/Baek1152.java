import java.util.Scanner;

public class Baek1152 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String q = str.trim();

        if (q.isEmpty()) {
            System.out.println("0");
        }
        else {
            System.out.println(q.split(" ").length);
        }
    }
}

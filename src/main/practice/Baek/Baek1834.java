import java.util.Scanner;

public class Baek1834 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long a = s.nextLong();
        long hap = 0;
        for (int i = 0; i < a; i++) {
            hap += i * a + i;
        }
        System.out.println(hap);
    }
}

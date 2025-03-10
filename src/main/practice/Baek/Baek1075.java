import java.util.Scanner;

public class Baek1075 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        int b = s.nextInt();

        String a2 = a.substring(a.length()-2);

        int a3 = Integer.parseInt(a) - Integer.parseInt(a2);

        while (a3 % b != 0){
            a3++;
        }

        String a4 = String.valueOf(a3);

        System.out.println(a4.substring(a.length()-2));
    }
}

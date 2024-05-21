import java.util.Scanner;

public class Baek1526 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();

        while (true) {
            boolean b = true;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != '4' && a.charAt(i) != '7') {
                    b = false;
                    break;
                }
            }
                if (b == true) {
                    break;
                } else if (b == false) {
                    a = String.valueOf(Integer.parseInt(a) - 1);
                }
            }System.out.println(a);
        }
    }


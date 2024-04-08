import java.util.Scanner;

public class Baek2739 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int a = s.nextInt ();

            for (int j = 1; j <= 9; j++) {
                System.out.println(a + " * " + j + " = " + (a*j));
            }
        }
    }


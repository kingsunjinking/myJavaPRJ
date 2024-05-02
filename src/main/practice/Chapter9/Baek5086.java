import java.util.Scanner;

public class Baek5086 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {
            int a = s.nextInt(); int b = s.nextInt();

            if(a==0 && b==0){
                break;
            }
            else if (a%b==0) {
                System.out.println("multiple");
            }
            else if (b%a ==0){
                System.out.println("factor");
            }
            else {
                System.out.println("neither");
            }
        }
    }
}

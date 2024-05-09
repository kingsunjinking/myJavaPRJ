import java.util.Scanner;

public class Baek11653 {                    //소인수분해
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int i = 2;
        while (a != 1){
            if(a % i != 0) {
                i++;
            }
            else if (a % i == 0) {
                System.out.println(i);
                a = a / i;
            }
            else if(a == 1){
                break;
            }
        }
    }
}

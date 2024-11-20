import java.util.Scanner;

public class Baek1247 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            long a = s.nextLong();
            long c = 0;
            for (int j = 0; j < a; j++) {
                c += s.nextLong();
            }
            if(c == 0){
                System.out.println(0);
            }
            else if(c > 0){
                System.out.println("+");
            }
            else{
                System.out.println("-");
            }
        }
    }
}

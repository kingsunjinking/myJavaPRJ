import java.util.Scanner;

public class Baek2869 {                     //시간초과
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = 0;
        int count = 1;
        for (int i = 0; i <c ; i++) {
            d += a;
            if (d >= c){
                break;
            }
            d -= b;
            count++;
        }
        System.out.println(count);
    }
}

import java.util.Scanner;

public class Baek1267 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        int y = 0;
        int m = 0;

        for (int i = 0; i < a; i++) {
            int d = s.nextInt();
            int ys = d;
            int ms = d;
            while (true){
                y += 10;
                ys -= 30;
                if (ys < 0){
                    break;
                }
            }
            while (true){
                m += 15;
                ms -= 60;
                if(ms < 0){
                    break;
                }
            }
        }

        if(y<m){
            System.out.print("Y " + y);
        } else if (m < y) {
            System.out.print("M " + m);
        }
        else {
            System.out.println("Y M " + y);
        }
    }
}

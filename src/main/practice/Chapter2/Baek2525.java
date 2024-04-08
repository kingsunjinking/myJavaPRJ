import java.util.Scanner;

public class Baek2525 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = (b+c)%60-b;

        if (b + c < 60) {
            System.out.printf("%d %d", a, b + c);
        }
        else if (c < 60 && b + c > 60) {
            if (a == 23) {
                System.out.printf("%d %d", 0, b + c - 60);
            }
            else {
                System.out.printf("%d %d", a + 1, b + c - 60);
            }
        }
        else if (c > 60){
            if ((a + c/60) > 23 && d >= 0){
                System.out.printf("%d %d", (a + c/60) % 24, (b+c)% 60);
            }
            else if ((a + c/60) > 23 && d < 0){
                System.out.printf("%d %d", (a + c/60) % 23, (b+c)%60);
            }
            else if(d >= 0){
                System.out.printf("%d %d",(a + c / 60), (b + c) % 60);
            }
            else if(d < 0){
                System.out.printf("%d %d", (a + c / 60)+1, (b + c) % 60);
            }
        }
    }
}

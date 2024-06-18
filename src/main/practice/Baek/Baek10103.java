import java.util.Scanner;

public class Baek10103 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int a = s.nextInt();
        int ch = 100;
        int sd = 100;
        for (int i = 0; i < a; i++) {
            int chscore = s.nextInt();
            int sdscore = s.nextInt();

            if (chscore > sdscore){
                sd = sd - chscore;
            } else if (sdscore > chscore) {
                ch = ch - sdscore;
            }
        }
        System.out.print(ch + "\n" + sd);

    }
}

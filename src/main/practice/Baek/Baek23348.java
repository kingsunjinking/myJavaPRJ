import java.util.Scanner;

public class Baek23348 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int one = s.nextInt();
        int noLook = s.nextInt();
        int phone = s.nextInt();

        int count = s.nextInt();

        int maxScore = 0;

        for (int i = 0; i < count; i++) {
            int score = 0;

            for (int j = 0; j < 3; j++) {
                int one1 = s.nextInt();
                int noLook1 = s.nextInt();
                int phone1 = s.nextInt();

                score += (one1*one) + (noLook1*noLook) + (phone1*phone);
            }

            if(maxScore < score){
                maxScore = score;
            }
        }

        System.out.println(maxScore);
    }
}

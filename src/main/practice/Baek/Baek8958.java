import java.util.Scanner;

public class Baek8958 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for (int i = 0; i < a; i++) {
            String ox = s.next();
            int count = 0;
            int score = 0;

            for (int j = 0; j < ox.length(); j++) {
                if(ox.charAt(j) == 'O'){
                    count++;
                }
                if(ox.charAt(j) == 'X'){
                    count = 0;
                }
                score += count;
            }

            System.out.println(score);
        }
    }
}

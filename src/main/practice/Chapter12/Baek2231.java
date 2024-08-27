import java.util.Scanner;

public class Baek2231 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int answer = 0;

        for (int i = 0; i < a; i++) {
            String b = i + "";
            int c = 0;
            for (int j = 0; j < b.length(); j++) {
                c += Character.getNumericValue(b.charAt(j));
            }
            if (i + c == a){
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}

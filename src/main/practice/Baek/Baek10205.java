import java.util.Scanner;

public class Baek10205 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for (int i = 0; i < a; i++) {
            int b = s.nextInt();
            String c = s.next();

            for (int j = 0; j < c.length(); j++) {
                if(c.charAt(j) == 'c'){
                    b++;
                }
                else{
                    b--;
                }
            }

            System.out.println("Data Set " + (i+1) + ":" + "\n" + b + "\n");
        }
    }
}

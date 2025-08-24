import java.util.Scanner;

public class Baek1264 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while(true){
            int count = 0;

            String a = s.nextLine();

            if(a.equals("#")){
                break;
            }

            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i) == 'a' || a.charAt(i) == 'A'
                        || a.charAt(i) == 'e' || a.charAt(i) == 'E'
                        || a.charAt(i) == 'i' || a.charAt(i) == 'I'
                        || a.charAt(i) == 'o' || a.charAt(i) == 'O'
                        || a.charAt(i) == 'u' || a.charAt(i) == 'U'){
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}

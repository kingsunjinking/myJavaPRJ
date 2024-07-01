import java.util.Scanner;

public class Baek1284 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        boolean a = true;

        while (true){
            String b = s.next();
            int c = 2;

            if (b.equals("0")){
                break;
            }

            else {
                for (int i = 0; i < b.length(); i++) {
                    if (String.valueOf(b.charAt(i)).equals("1")) {
                        c += 2;
                    } else if (String.valueOf(b.charAt(i)).equals("0")) {
                        c += 4;
                    } else {
                        c += 3;
                    }

                    if(i != b.length()-1) {
                        c += 1;
                    }
                }
            }

            System.out.println(c);
        }
    }
}

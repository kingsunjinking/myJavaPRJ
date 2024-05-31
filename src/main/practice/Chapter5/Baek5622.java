import java.util.Scanner;

public class Baek5622 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String num = s.nextLine();
        int count = 0;
        for (int i = 0; i <num.length() ; i++) {
            if((int)num.charAt(i) < 68){
                count += 3;
            }
            else if ((int)num.charAt(i) < 71){
                count += 4;
            }
            else if ((int)num.charAt(i) < 74){
                count += 5;
            }
            else if ((int)num.charAt(i) < 77){
                count += 6;
            }
            else if ((int)num.charAt(i) < 80){
                count += 7;
            }
            else if ((int)num.charAt(i) < 84){
                count += 8;
            }
            else if ((int)num.charAt(i) < 87){
                count += 9;
            }
            else if ((int)num.charAt(i) < 91){
                count += 10;
            }

        }System.out.println(count);
    }
}

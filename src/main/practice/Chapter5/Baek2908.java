import java.util.Scanner;

public class Baek2908 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str3 = "";
        String str4 = "";
        int a = 0;
        int b = 0;

        for (int i = str1.length()-1; i >= 4; i--){
            str3 += str1.charAt(i);
            a = Integer.parseInt(str3);
        }

        for (int i = str1.length()-5; i >= 0; i--){
            str4 += str1.charAt(i);
            b = Integer.parseInt(str4);
        }

        if(a>b){
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        }
    }
}

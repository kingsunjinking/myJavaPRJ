import java.util.Scanner;

public class Baek2439 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for (int i = 0; i < a; i++){
            System.out.print("");
            for (int j = a-1; j > i; j--){
                System.out.print(" ");}
            for (int q = 0; q <= i; q++){
                System.out.print("*");}

            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Baek2444 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        String star = "";

        for(int i = 1; i <= a; i++){
            for(int j = a-1; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j < i ; j++){

                System.out.print("*");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<a; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = a-1; j >= i; j--){
                System.out.print("*");
            }
            for(int j = a-2; j >=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

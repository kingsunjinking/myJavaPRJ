import java.util.Scanner;

public class Quiz240409 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); int b = s.nextInt();

        if(a < b) {
            for (int i = a; i <= b; i++) {
                if(i%3 ==0){
                System.out.print(i + " ");}
            }
        }
        else if (a > b){
            for (int i = a; i >=b; i--) {
                if(i%3==0){
                System.out.print(i + " ");}
            }
        }
        else {
            System.out.print("두 수가 같음");
        }
}
}

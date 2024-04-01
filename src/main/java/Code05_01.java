import java.util.Scanner;

public class Code05_01 {
    public static void main(String[] args){


        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if(num < 100) {
            System.out.println("100보다 작습니다");
        }
        else if(num == 100) {
            System.out.println("100입니다");
        }
        else if(num > 100){
            System.out.println("100보다 큽니다");
        }
    }
}

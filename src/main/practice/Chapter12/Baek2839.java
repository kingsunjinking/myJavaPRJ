import java.util.Scanner;

public class Baek2839 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int count = 0;

        if (a % 5 == 0){
            System.out.println(a/5);
        } else if (a == 4 || a == 7) {
            System.out.println(-1);
        } else {
            while (true){
                if(a == 12){
                    count += 4;
                    break;
                }
                if (a == 11){
                    count += 3;
                break;
                }
                if (a == 9){
                    count += 3;
                    break;
                }
                if (a == 6){
                    count += 2;
                    break;
                }
                if (a == 3){
                    count += 1;
                    break;
                }
                a = a-5;
                count++;
            }
            System.out.println(count);
        }
    }
}

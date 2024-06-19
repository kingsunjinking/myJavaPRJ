import java.util.Arrays;
import java.util.Scanner;

public class Baek5543 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] burger = new int[3];
        int [] drink = new  int[2];
        burger [0] = s.nextInt();
        burger [1] = s.nextInt();
        burger [2] = s.nextInt();
        drink [0] = s.nextInt();
        drink [1] = s.nextInt();

        Arrays.sort(burger);
        Arrays.sort(drink);

        System.out.println(burger[0] + drink[0]-50);
    }
}
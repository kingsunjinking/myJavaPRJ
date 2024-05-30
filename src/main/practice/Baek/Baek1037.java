import java.util.Arrays;
import java.util.Scanner;

public class Baek1037 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int [] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }

        if (a == 1){
            System.out.print((int)Math.pow(arr[0],2));
        }
        else{
            System.out.println(Arrays.stream(arr).max().getAsInt() *Arrays.stream(arr).min().getAsInt());
        }
    }
}

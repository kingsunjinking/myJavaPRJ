import java.util.Arrays;
import java.util.Scanner;

public class Baek1181 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        String [] arr = new String[a];

        for (int i = 0; i < a; i++) {
            arr[i] = s.next();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

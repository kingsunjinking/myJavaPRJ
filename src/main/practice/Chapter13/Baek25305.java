import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baek25305 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        Integer arr [] = new Integer[a];

        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        System.out.print(arr[b-1]);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Baek2455 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int f = s.nextInt();
        int g = s.nextInt();
        int h = s.nextInt();


        int [] arr = new int[4];

        arr[0] = b;
        arr[1] = arr[0] - c + d;
        arr[2] = arr[1] - e + f;
        arr[3] = arr[2] - g;

        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}

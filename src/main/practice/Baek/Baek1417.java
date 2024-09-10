import java.util.Arrays;
import java.util.Scanner;

public class Baek1417 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int count = 0;
        if (a != 1) {
            int[] arr = new int[a - 1];
            for (int i = 0; i < a - 1; i++) {
                arr[i] = s.nextInt();
            }
            Arrays.sort(arr);

            while (true) {
                if (b <= Arrays.stream(arr).max().getAsInt()) {
                    arr[arr.length - 1] = arr[arr.length - 1] - 1;
                    b++;
                    count++;
                    if (arr[arr.length - 1] < Arrays.stream(arr).max().getAsInt()) {
                        Arrays.sort(arr);
                    }
                } else if (b > Arrays.stream(arr).max().getAsInt()) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

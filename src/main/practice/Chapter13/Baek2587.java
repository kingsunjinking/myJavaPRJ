import java.util.Arrays;
import java.util.Scanner;

public class Baek2587 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr [] = new int[5];
        int hap = 0;
        for(int i = 0; i < 5; i++){
            arr [i] = s.nextInt();
            hap += arr[i];
        }

        Arrays.sort(arr);

        System.out.println(hap/arr.length);
        System.out.println(arr[arr.length/2 ]);
    }
}

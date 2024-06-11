import java.util.Arrays;
import java.util.Scanner;

public class Baek2435 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        
        int [] arr = new int[a];
        int [] arr2 = new int[a-b+1];

        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < a-b+1; i++) {
            int c = 0;
            for (int j = i; j < i+b; j++) {
                c+=arr[j];
            }
            arr2[i] = c;
        }
        Arrays.sort(arr2);

        System.out.println(arr2[arr2.length-1]);
    }
}

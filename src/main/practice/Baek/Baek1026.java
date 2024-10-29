import java.util.Arrays;
import java.util.Scanner;

public class Baek1026 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[] arr = new int[a];
        int[] arr2 = new int[a];
        int[] arr3 = new int[a];
        int[] arr4 = new int[a];
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Arrays.stream(arr2).max().getAsInt() == arr2[j]) {
                    arr4[j] = arr2[j];
                    arr2[j] = -1;
                    arr3[j] = Arrays.stream(arr).min().getAsInt();
                    for (int k = 0; k < arr.length; k++) {
                        if(Arrays.stream(arr).min().getAsInt() == arr[k]){
                            arr[k] = 101;
                            break;
                        }
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            tmp += arr3[i] * arr4[i];
        }
        System.out.println(tmp);
    }
}

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 1; i < 5; i++) {
            int b = arr[i];
            for (int j = i; j >= 0; j--) {
                if(j==0){
                    arr[0] = b;
                }
                else if (b < arr[j-1]) {
                    arr[j] = arr[j-1];
                }
                else if(b > arr[j-1]){
                    arr[j] = b;
                    break;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

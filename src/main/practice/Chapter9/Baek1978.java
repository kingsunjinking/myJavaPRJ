import java.util.Scanner;

public class Baek1978 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int hap = 0;
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 2;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0){
                    count--;
                }
            }
            if(count == 0){
                    hap++;
            }
        }System.out.print(hap);
    }
}

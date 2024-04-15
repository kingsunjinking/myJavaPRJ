import java.util.Scanner;

public class Baek10813 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt(); int b = s.nextInt();

        int [] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr [i] = i+1;
        }

        for (int i = 0; i < b; i++){
        int c = s.nextInt(); int d = s.nextInt();
        int x = arr[c-1];
        arr[c-1] = arr[d-1];
        arr[d-1] = x;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

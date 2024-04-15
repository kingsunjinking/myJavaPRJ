import java.util.Scanner;

public class Baek10811 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int[] arr = new int[a];
        int[] reverse = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < b; i++) {
            int c = s.nextInt(); int d = s.nextInt();
            for(int j = c; j <= d; j++){
                reverse[c+d-j-1] = arr[j-1];
            }
            for(int j =c; j<=d; j++){
                arr[j-1]=reverse[j-1];
            }
        }
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

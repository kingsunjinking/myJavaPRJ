import java.util.Scanner;

public class Baek1547 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int [] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int a = s.nextInt();

        for (int i = 0; i < a; i++) {
            int b = s.nextInt();
            int c = s.nextInt();

            int d = arr[b-1];
            arr[b-1] =arr[c-1];
            arr[c-1] = d;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                System.out.println(i+1);
                break;
            }
        }
    }
}

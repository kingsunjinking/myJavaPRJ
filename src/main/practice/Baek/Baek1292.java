import java.util.Scanner;

public class Baek1292 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[] = new int[1000];
        int c = 0;
        int d = 0;
        int a = s.nextInt();
        int b = s.nextInt();

        for (int i = 1; d < 1000; i++) {
            for (int j = 0; j < i; j++) {
                arr[d] = i;
                d++;
                if(d == 1000){
                    break;
                }
            }
        }

        for (int i = a-1; i < b; i++) {
                c += arr[i];
        }
        System.out.println(c);
    }
}

import java.util.Scanner;

public class Baek2456 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = 0; int c =0;
        int a = s.nextInt();
        int [] arr = new int[3];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 3; j++) {
                arr[j] += s.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            if (arr[b] < arr[i]){
                b = i;
                if(b==2){
                    break;
                }
            }
        }

        if(arr[0] == arr[1] && arr[1] == arr[2]){
            System.out.printf("%d %d", c, arr[b]);
        }
        else {
            System.out.printf("%d %d",b+1,arr[b]);
        }
    }
}

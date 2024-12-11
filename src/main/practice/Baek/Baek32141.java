import java.util.Arrays;
import java.util.Scanner;

public class Baek32141 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = 0;
        int count = 0;
        int [] arr = new int[a];

        for (int i = 0; i <a; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);

        while(count < arr.length){
            c+=arr[count];
            if(c >= b){
                break;
            }
            count++;
        }

        if(c < b){
            System.out.println(-1);
        }
        else {
            System.out.println(count+1);
        }
    }
}

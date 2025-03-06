import java.util.Arrays;
import java.util.Scanner;

public class Baek9723 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for (int i = 1; i <= a; i++) {

            int [] arr = new int[3];

            for (int j = 0; j < 3; j++) {
                arr[j] = s.nextInt();
            }

            Arrays.sort(arr);

            if(Math.pow(arr[0],2) + Math.pow(arr[1],2) == Math.pow(arr[2],2)){
                System.out.println("Case #" + i + ": YES");
            }
            else{
                System.out.println("Case #" + i + ": NO");
            }
        }
    }
}

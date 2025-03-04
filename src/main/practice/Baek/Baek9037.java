import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Baek9037 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        Set<Integer> set = new HashSet<Integer>();


        for (int i = 0; i < a; i++) {

            int b = s.nextInt();
            int cnt = 0;

            Integer [] arr = new Integer[b];
            Integer [] arr2 = new Integer[b];

            for (int j = 0; j < b; j++) {
                arr[j] = Integer.parseInt(s.next());
                if(arr[j] % 2 != 0){
                    arr[j]++;
                }
            }

            set = new HashSet<Integer>(Arrays.asList(arr));


            while (set.size() != 1) {
                for (int j = 0; j < arr.length-1; j++) {
                    arr2[j+1] = arr[j]/2;
                    arr[j] -= arr[j]/2;
                }
                arr2[0] = arr[arr.length-1]/2;
                arr[arr.length-1] -= arr[arr.length-1]/2;

                for (int j = 0; j < arr.length; j++) {
                    arr[j] += arr2[j];
                }

                for (int j = 0; j < arr.length; j++) {
                    if(arr[j] % 2 != 0){
                        arr[j]++;
                    }
                }

                cnt++;

                set = new HashSet<Integer>(Arrays.asList(arr));

            }

            System.out.println(cnt);

        }
    }
}

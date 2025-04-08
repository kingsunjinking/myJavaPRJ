import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baek25214 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int a =s.nextInt();

        if(a == 1){
            s.nextInt();
            System.out.println(0);
            return;
        }
        int[] arr = new int[2];

        arr[0] = s.nextInt();
        list.add(0);
        arr[1] = s.nextInt();

        int min = Math.min(arr[0], arr[1]);
        int max = Math.max(arr[0],arr[1]);

        int result;

        if(arr[1]-arr[0] <= 0){
            result = 0;
        }else {
            result = arr[1] - arr[0];
        }
        list.add(result);

        arr[0] = min;
        arr[1] = max;

        for (int i = 0; i < a-2; i++) {
            int b = s.nextInt();
            if(b-min > result){
                list.add(b-min);
                result = (b-min);
                continue;
            }
            else if (b < arr[0]){
                arr[0] = b;
                min = b;
            }

            list.add(result);
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

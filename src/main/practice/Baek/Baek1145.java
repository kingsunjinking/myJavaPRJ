import java.util.Arrays;
import java.util.Scanner;

public class Baek1145 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = new int[5];

        for (int i = 0; i <5; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);
        int ans = 1;
        while (true){
            int count = 0;
            if(ans % arr[0] == 0){count++;}
            if(ans % arr[1] == 0){count++;}
            if(ans % arr[2] == 0){count++;}
            if(ans % arr[3] == 0){count++;}
            if(ans % arr[4] == 0){count++;}
            if(count >=3 ){
                System.out.println(ans);
                break;
            }
            ans++;
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Baek2581 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int hap = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int k = a; k <= b; k++) {
                int count = 2;
                for (int j = 1; j <= k; j++) {
                    if (k % j == 0) {
                        count--;
                    }
                }
                if (count == 0) {
                    arr.add(k);
                    hap+=k;
                }
            }
            if(hap == 0){
                System.out.println("-1");
            }
            else {
                System.out.println(hap);
                System.out.println(arr.get(0));
            }
        }
    }



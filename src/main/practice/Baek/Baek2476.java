import java.util.Arrays;
import java.util.Scanner;

public class Baek2476 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        int hap = 0;

        for (int i = 0; i < a; i++) {

            int count = 0;
            int[] arr = new int[3];

                for (int k = 0; k < arr.length; k++) {
                    arr[k] = s.nextInt();
                }

                    if (arr[0] == arr[1] && arr[0] == arr[2]) {
                        count = 10000 + arr[0] * 1000;
                    } else if ((arr[0] == arr[1] && arr[0] != arr[2]) || (arr[0] == arr[2] && arr[0] != arr[1])) {
                        count = 1000 + arr[0] * 100;
                    } else if (arr[1] == arr[2] && arr[1] != arr[0]) {
                        count = 1000 + arr[1] * 100;
                    } else {
                        Arrays.sort(arr);
                        count = arr[2] * 100;
                    }

                if (hap < count) {
                    hap = count;
                }
            }

            System.out.println(hap);
        }
    }


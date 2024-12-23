import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baek1895 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int [][] arr = new int[a][b];
        int [][] arr2 = new int[a-2][b-2];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        int d = s.nextInt();
        int count = 0;

        for (int i = 0; i < a - 2; i++) {
            for (int j = 0; j < b - 2; j++) {
                List<Integer> filter = new ArrayList<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        filter.add(arr[i+k][j+l]);
                    }
                }
                Collections.sort(filter);
                arr2[i][j] = filter.get(4);
            }
        }

        for (int i = 0; i < a-2; i++) {
            for (int j = 0; j < b-2; j++) {
                if(arr2[i][j] > d){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
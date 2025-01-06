import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Baek1268 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        int [][] arr = new int[a][5];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        int count = 0;
        int student = 0;

        for (int i = 0; i < a; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < a; k++) {
                    if(arr[i][j] == arr[k][j] && k != i){
                        set.add(k);
                    }
                }
            }
            if(set.size() > count){
                student = i;
                count = set.size();
            }
        }

        System.out.println(student+1);
    }
}

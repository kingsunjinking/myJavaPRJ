import java.util.Scanner;

public class Baek18247 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for (int i = 0; i < a; i++) {
            int b = s.nextInt();
            int c = s.nextInt();
            int n = 0;
            int m = 0;
            int [][] arr = new int[b][c];

            for (int j = 1; j <= b*c; j++) {

                arr[n][m] = j;

                m++;

                if(m == c){
                    m = 0;
                    n++;
                }
            }
            if(b < 12 || c < 4){
                System.out.println(-1);
            }else {
                System.out.println(arr[11][3]);
            }
        }
    }
}

import java.util.Scanner;

public class Baek3076 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        char [][] arr = new char[a*c][b*d];

        int chk2 = 0;
        boolean chk = true;

        for (int i = 0; i < a * c; i++) {
            if(chk == true && chk2 == c){
                chk = false;
                chk2 = 0;
            }
            if(chk == false && chk2 == c){
                chk = true;
                chk2 = 0;
            }
            int cnt = 0;
            for (int j = 0; j < b*d; j++) {
                if(chk == true && cnt >= d){
                    arr[i][j] = '.';
                    cnt ++;
                }
                if(chk == true && cnt < d){
                    arr[i][j] = 'X';
                    cnt ++;
                }
                if(chk == false && cnt >= d){
                    arr[i][j] = 'X';
                    cnt ++;
                }
                if(chk == false && cnt < d){
                    arr[i][j] = '.';
                    cnt ++;
                }
                if(cnt == d*2){
                    cnt = 0;
                }
            }
            chk2 ++;
        }

        for (int i = 0; i < a*c; i++) {
            for (int j = 0; j < b*d; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

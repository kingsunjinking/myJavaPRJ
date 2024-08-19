import java.util.Scanner;

public class Baek2804 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        int c = a.length();
        int d = 0;

        char [][] arr = new char[b.length()][a.length()];

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if((int)a.charAt(i) == (int)b.charAt(j)){
                    c = i;
                    d = j;
                    break;
                }
            }
            if(c == i){
                break;
            }
        }

        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                arr[i][j] = '.';
                if(j == c){
                    arr[i][c] = b.charAt(i);
                }
                if(i == d){
                    arr[d][j] = a.charAt(j);
                }
            }
        }
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

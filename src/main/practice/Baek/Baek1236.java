import java.util.Scanner;

public class Baek1236 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        char[][] arr = new char[a][b];

        int count = 0;
        int count2 = 0;
        for (int i = 0; i < a; i++) {
            String st = s.next();
            for (int j = 0; j < b; j++) {
                arr[i][j] = st.charAt(j);
            }
        }

        for (int i = 0; i < a; i++) {
            boolean c = true;

            for (int j = 0; j < b; j++) {
                if(arr[i][j] == 'X'){
                    c = false;
                }
            }
            if(c == true){
                count++;
            }
        }

        for (int i = 0; i < b; i++) {
            boolean c = true;

            for (int j = 0; j < a; j++) {
                if(arr[j][i] == 'X'){
                    c = false;
                }
            }
            if(c == true){
                count2++;
            }
        }
        System.out.println(Math.max(count,count2));
    }
}

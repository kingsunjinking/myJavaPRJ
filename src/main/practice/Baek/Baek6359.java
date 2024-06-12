import java.util.Scanner;

public class Baek6359 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for (int i = 0; i < a; i++) {
            int c = 1;
            int e = 2;
            int f = 1;
            int d = 0;
            int b = s.nextInt();
            int [] arr = new int[b];

            for (int j = 0; j < b; j++) {
                while (true){
                    if (c>b){
                        break;
                    }
                    if (arr[c-1] == 0) {
                        arr[c-1] = 1;
                    } else if (arr[c-1] == 1) {
                        arr[c-1] = 0;
                    }
                    c= f*e;
                    e++;
                }
                e = 2;
                f++;
                c=f;
            }
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == 1){
                    d++;
                }
            }
            System.out.println(d);
        }
    }
}

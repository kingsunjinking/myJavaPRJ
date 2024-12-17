import java.util.Scanner;

public class Baek1940 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int [] arr = new int[a];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            int c = 1;
            for (int j = arr.length-i-1; j > 0 ; j--) {
                if(arr[i] + arr[i+c] == b){
                    count ++;
                }
                c++;
            }
        }

        System.out.println(count);
    }
}

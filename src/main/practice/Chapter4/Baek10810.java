import java.util.Scanner;

public class Baek10810 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int [] arr = new int[a];

        for(int i = 0 ; i < b; i++){
            int c = s.nextInt(); int d = s.nextInt(); int e = s.nextInt();
            for(int j = c-1; j <= d-1; j++){
                arr[j]=e;
            }
        }
        for(int i = 0 ; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

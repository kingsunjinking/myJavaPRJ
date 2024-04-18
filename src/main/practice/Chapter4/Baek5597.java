import java.util.Scanner;

public class Baek5597 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int [] arr = new int[30];

        for (int i = 0; i < 28; i++) {
            int a = s.nextInt();
            arr[a-1] = a;
        }

        for (int i = 0; i <30; i++){
            if(arr[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}

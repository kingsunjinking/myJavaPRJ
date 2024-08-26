import java.util.Scanner;

public class Baek2798 {                     //브루트포스 블랙잭
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int [] arr = new int[a];
        int answer = 0;

        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }


        for (int i = 0; i < a-2; i++) {
            for (int j = i+1; j < a-1; j++) {
                for (int k = j+1; k < a; k++) {
                    if (arr[i] + arr[j] + arr[k] <= b && answer < arr[i] + arr[j] + arr[k]){
                        answer = arr[i] + arr[j] + arr[k];
                    }
                }
            }
            if(answer == b){
                break;
            }
        }

        System.out.println(answer);
    }
}

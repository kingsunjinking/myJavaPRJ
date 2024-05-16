import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = s. nextInt();
        }

        for (int i = 0; i < 4; i++) {
            int a = i;
            for (int j = i+1; j < 5; j++){
                if(arr[a] > arr[j]){
                    a = j;
                }
            }
            int b = arr[a];
            arr[a] = arr[i];
            arr[i] = b;
        }

        for (int i = 0; i < 5; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

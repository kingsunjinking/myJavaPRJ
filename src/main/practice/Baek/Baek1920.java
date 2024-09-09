import java.util.Scanner;

public class Baek1920 {                     //시간초과
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        long [] arr = new long[a];
        for (int i = 0; i < a; i++) {
            arr[i] = s.nextLong();
        }

        int b = s.nextInt();
        long [] arr2 = new long[b];
        for (int i = 0; i < b; i++) {
            arr2[i] = s.nextLong();
        }

        for (int i = 0; i < b; i++) {
            boolean bb = true;
            for (int j = 0; j < a; j++) {
                if (arr2[i] == arr[j]){
                    System.out.println("1");
                    bb = false;
                    break;
                }
            }if(bb == true){ System.out.println("0");}
        }
    }
}

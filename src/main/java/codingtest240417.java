import java.util.Scanner;

public class codingtest240417 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int [] bubble = new int[a];
        int x = 0;
        for (int i = 0; i < bubble.length; i++) {
            bubble[i] = s.nextInt();
        }

        for (int i = bubble.length-1; i >0 ; i--) {
            for (int j = 0; j < i; j++){
                if(bubble[j]>bubble[j+1]){
                    x = bubble[j];
                    bubble[j] = bubble[j+1];
                    bubble[j+1] = x;
                }
            }
        }
        for (int i = 0; i < bubble.length; i++) {
            System.out.print(bubble[i]);
        }
    }
}

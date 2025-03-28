import java.util.Arrays;
import java.util.Scanner;

public class Baek17851 {
    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);

        int [] stateU = new int[5];
        int [] uState = new int[5];

        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            stateU[i] = s.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            uState[i] = s.nextInt();
        }

        Arrays.sort(stateU);
        Arrays.sort(uState);

        for (int i = 0; i < 5; i++) {
            if(uState[i] < stateU[i]){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}

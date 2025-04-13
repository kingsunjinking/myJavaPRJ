import java.util.Scanner;

public class Baek12866 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        String b = s.next();
        long [] arr = new long[b.length()];

        for (int i = 0; i < a; i++) {
            if(b.charAt(i) == 'A'){
                arr[0]++;
            }
            if(b.charAt(i) == 'C'){
                arr[1]++;
            }
            if(b.charAt(i) == 'G'){
                arr[2]++;
            }
            if(b.charAt(i) == 'T'){
                arr[3]++;
            }
        }

        int MOD = 1000000007;
        long cnt = 1;

        for (int i = 0; i < 4; i++) {
            cnt = (cnt * arr[i]) % MOD;
        }

        System.out.println(cnt);
    }
}

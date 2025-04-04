import java.math.BigInteger;
import java.util.Scanner;

public class Baek1837 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        BigInteger a = new BigInteger(s.next());
        int b =s.nextInt();

        boolean chk = true;
        for (int i = 2; i <= b; i++) {
            if(a.mod(BigInteger.valueOf(i)).compareTo(BigInteger.valueOf(0)) == 0){
                if(i < b){
                    System.out.println("BAD " + i);
                    break;
                }
            }
            if(i == b){
                chk = false;
            }
        }
        if(chk == false){
            System.out.println("GOOD");
        }
    }
}

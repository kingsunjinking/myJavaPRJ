import java.util.Arrays;
import java.util.Scanner;

public class Baek1316 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        int count = 0;

        for (int i = 0; i < a; i++) {
            boolean chk = false;
            boolean [] arr = new boolean[26];
            Arrays.fill(arr,false);
            String b = s.next();
            for (int j = 0; j < b.length(); j++) {
                if (j != 0){
                    if(b.charAt(j) != b.charAt(j-1)){
                        if (arr[(int) b.charAt(j) - 97] == true) {
                            chk = true;
                            break;
                        }
                    }
                }
                arr[(int)b.charAt(j)-97] = true;
            }
            if(chk == false){
                count++;
            }
        }

        System.out.println(count);
    }
}

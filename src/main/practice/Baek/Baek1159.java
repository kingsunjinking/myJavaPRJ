import java.util.Scanner;

public class Baek1159 {     //첫글자가 같은 사람으로 농구 팀 뽑기
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean c = false;
        int a = s.nextInt();
        int [] arr = new int[26];

        for (int i = 0; i < a; i++) {
            String player = s.next();
            arr[(int)player.charAt(0)-97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5){
                c = true;
                System.out.print((char)(i+97));
            }
        }

        if (c == false){
            System.out.println("PREDAJA");
        }
    }
}

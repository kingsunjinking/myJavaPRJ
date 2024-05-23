import java.util.Arrays;
import java.util.Scanner;

public class Baek1157 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[26];
        int c = 0;
        String a = s.nextLine();
        String b = a.toUpperCase();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < a.length(); j++) {
                if(b.charAt(j) == (char)i+65) {
                    arr[i]++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(Arrays.stream(arr).max().getAsInt() == arr[i]){
                c=i;
            }
        }

        Arrays.sort(arr);

        if(arr[arr.length-1] == arr[arr.length-2]){
        System.out.println("?");
        }
        else {
            System.out.println((char)(c+65));
        }
    }
}

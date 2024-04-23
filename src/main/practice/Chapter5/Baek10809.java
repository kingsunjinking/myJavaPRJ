import java.util.Scanner;

public class Baek10809 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char [] arr = new char[26];
        int x = 97;
        for (int i =0; i< 26; i++){
            char k = (char) x;
            arr[i]=k;
            x++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(str.indexOf(arr[i])+" ");
        }
    }
}

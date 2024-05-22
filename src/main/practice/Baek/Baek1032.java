import java.util.Scanner;

public class Baek1032 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String [] arr = new String[a];


        for (int i = 0; i < a; i++) {
            arr[i] = s.next();
        }
        char [] arr2 = new char[arr[0].length()];
        if(a==1){
            for (int i = 0; i < arr[0].length(); i++) {
                arr2[i] = arr[0].charAt(i);
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]){
                for (int j = 0; j < arr[i].length(); j++) {
                    if(arr2[j] != '?') {
                        arr2[j] = arr[i].charAt(j);
                    }
                    if(arr[i].charAt(j) != arr[i+1].charAt(j)){
                        arr2[j] = '?';
                    }
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }
}

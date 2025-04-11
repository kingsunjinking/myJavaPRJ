import java.util.Scanner;

public class Baek3023 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        String [] arr = new String[a*2];

        for (int i = 0; i < a; i++) {
            arr[i] = s.next();
        }

        int c = s.nextInt();
        int d = s.nextInt();

        for (int i = 0; i < arr.length/2; i++) {
            StringBuffer sb = new StringBuffer(arr[i]);
            String reverse = sb.reverse().toString();
            arr[i] = arr[i] + reverse;
            arr[arr.length-1-i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if(i == c-1){
                boolean chk = true;
                if(chk == true && arr[c-1].charAt(d-1) == '#'){
                    arr[c-1] = arr[c-1].substring(0,d-1) + "." + arr[c-1].substring(d);
                    chk = false;
                }
                if(chk == true && arr[c-1].charAt(d-1) == '.'){
                    arr[c-1] = arr[c-1].substring(0,d-1) + "#" + arr[c-1].substring(d);
                }
            }

            System.out.println(arr[i]);
        }

    }
}

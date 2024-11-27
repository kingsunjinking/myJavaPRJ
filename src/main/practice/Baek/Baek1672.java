import java.util.Scanner;

public class Baek1672 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        char[] a = new char[]{'A', 'C', 'A', 'G'};
        char[] g = new char[]{'C', 'G', 'T', 'A'};
        char[] c = new char[]{'A', 'T', 'C', 'G'};
        char[] t = new char[]{'G', 'A', 'G', 'T'};
        String b = s.next();

        for (int i = 0; i < count-1; i++) {
            int l = 0;
            String p = "";
            switch (b.charAt(b.length()-2)){
                case 'A' : l = 0; break;
                case 'G' : l = 1; break;
                case 'C' : l = 2; break;
                case 'T' : l = 3; break;
            }
            switch (b.charAt(b.length()-1)){
                case 'A' : p += a[l]; break;
                case 'C' : p += c[l]; break;
                case 'G' : p += g[l]; break;
                case 'T' : p += t[l]; break;
            }
            b = b.substring(0,b.length()-2) + p;
        }

        System.out.println(b);
    }
}

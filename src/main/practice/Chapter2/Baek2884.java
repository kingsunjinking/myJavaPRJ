import java.util.Scanner;

public class Baek2884 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int h = s.nextInt(); int m = s.nextInt();

        int w = 45-m;
        int e = 60-w;
        int r = h-1;

        if(m>=45){
            int q = m-45;
            System.out.printf("%d %d",h, q);
        }
        else if(h==0 && m < 45){
            System.out.printf("23 %d",e);
        }
        else{
            System.out.printf("%d %d",r,e);
        }
    }
}

import java.util.Scanner;

public class Baek1436 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i = 666;
        int count = 1;
        while (count != a){
            i++;
                if (String.valueOf(i).contains("666")){
                    count++;
                }
            }System.out.println(i);
        }
    }


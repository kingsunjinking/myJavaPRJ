import java.util.ArrayList;
import java.util.Scanner;

public class Baek2501 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt(); int c =s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i =1; i <= a; i++){
            if(a % i ==0){
                arr.add(i);
            }
        }
        if(arr.size() < c){
            System.out.println("0");
        }
        else {
            System.out.println(arr.get(c - 1));
        }
    }
}

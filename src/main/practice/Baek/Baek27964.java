import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Baek27964 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cnt = s.nextInt();

        String [] arr = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = s.next();
        }

        Set <String> cheese = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() < 6){
                continue;
            }

            String a = arr[i].substring(arr[i].length()-6, arr[i].length());

            if(a.equals("Cheese")){
                cheese.add(arr[i]);
            }
        }

        if(cheese.size() >= 4){
            System.out.println("yummy");
        }else{
            System.out.println("sad");
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baek10773 {
    public static void main(String[] args) throws Exception{

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        long ans = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            int b = s.nextInt();

            if(b != 0){
                list.add(b);
            }else{
                list.remove(list.size()-1);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            ans += list.get(i);
        }

        System.out.println(ans);
    }
}

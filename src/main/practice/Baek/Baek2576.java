import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baek2576 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int b = 0;

        for (int i = 0; i < 7; i++) {
            int a = s.nextInt();

            if(a % 2 != 0){
                list.add(a);
                b+=a;
            }

        }

        if(list.size() == 0 ){
            System.out.println(-1);
        } else {
            System.out.println(b);
            Collections.sort(list);
            System.out.println(list.get(0));
        }


    }
}

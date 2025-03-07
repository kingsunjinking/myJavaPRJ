import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baek1076 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Map<String, Long> map = new HashMap<>();
        Map<String, Long> map2 = new HashMap<>();

        map.put("black", Long.valueOf(0));
        map.put("brown", Long.valueOf(1));
        map.put("red", Long.valueOf(2));
        map.put("orange", Long.valueOf(3));
        map.put("yellow", Long.valueOf(4));
        map.put("green", Long.valueOf(5));
        map.put("blue", Long.valueOf(6));
        map.put("violet", Long.valueOf(7));
        map.put("grey", Long.valueOf(8));
        map.put("white", Long.valueOf(9));

        map2.put("black", Long.valueOf(1));
        map2.put("brown", Long.valueOf(10));
        map2.put("red", Long.valueOf(100));
        map2.put("orange", Long.valueOf(1000));
        map2.put("yellow", Long.valueOf(10000));
        map2.put("green", Long.valueOf(100000));
        map2.put("blue", Long.valueOf(1000000));
        map2.put("violet", Long.valueOf(10000000));
        map2.put("grey", Long.valueOf(100000000));
        map2.put("white", Long.valueOf(1000000000));

        String a = String.valueOf(map.get(s.next()));
        String b = String.valueOf(map.get(s.next()));
        long c = map2.get(s.next());

        long ans = Long.valueOf((a+b))*c;

        System.out.println(ans);
    }
}

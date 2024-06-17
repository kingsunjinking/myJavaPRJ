import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baek30087 {
    public static void main(String[] args) {
        Map<String,String> se = new HashMap<>();
        Scanner s = new Scanner(System.in);

        se.put("Algorithm","204");
        se.put("DataAnalysis","207");
        se.put("ArtificialIntelligence","302");
        se.put("CyberSecurity","B101");
        se.put("Network","303");
        se.put("Startup","501");
        se.put("TestStrategy","105");

        int a = s.nextInt();

        for (int i = 0; i < a; i++) {
            String b = s.next();
            System.out.println(se.get(b));
        }
    }
}

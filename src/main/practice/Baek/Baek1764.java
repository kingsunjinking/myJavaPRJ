import java.util.*;

public class Baek1764 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        List<String> notListen = new ArrayList<>();
        HashSet<String> notSee = new HashSet<>();
        List<String> notListenSee = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            notListen.add(s.next());
        }
        for (int i = 0; i < b; i++) {
            notSee.add(s.next());
        }

        for (int i = 0; i < notListen.size(); i++) {
            if(notSee.contains(notListen.get(i)) == true){
               notListenSee.add(notListen.get(i));
            }
        }

        Collections.sort(notListenSee);

        System.out.println(notListenSee.size());
        for (int i = 0; i < notListenSee.size(); i++) {
            System.out.println(notListenSee.get(i));
        }
    }
}

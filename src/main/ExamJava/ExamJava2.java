import java.util.*;

public class ExamJava2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(s.nextInt());
        }

        Collections.sort(list);

        list.forEach(a -> System.out.print(a + " "));
        }

    }


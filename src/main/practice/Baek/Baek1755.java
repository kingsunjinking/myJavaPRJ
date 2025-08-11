import java.util.*;

public class Baek1755 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        Map<Character, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        map.put('0', "zero");
        map.put('1', "one");
        map.put('2', "two");
        map.put('3', "three");
        map.put('4', "four");
        map.put('5', "five");
        map.put('6', "six");
        map.put('7', "seven");
        map.put('8', "eight");
        map.put('9', "nine");

        Map<String, Character> map2 = new HashMap<>();

        map2.put("zero", '0');
        map2.put("one", '1');
        map2.put("two", '2');
        map2.put("three", '3');
        map2.put("four", '4');
        map2.put("five", '5');
        map2.put("six", '6');
        map2.put("seven", '7');
        map2.put("eight", '8');
        map2.put("nine", '9');

        for (int i = a; i <= b ; i++) {
            String c = String.valueOf(i);
            String d = "";

            for (int j = 0; j < c.length(); j++) {
                d += map.get(c.charAt(j)) + " ";
            }

            list.add(d);
        }

        Collections.sort(list);

        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String [] arr = list.get(i).split(" ");
            int c;
            String d = "";
            for (int j = 0; j < arr.length; j++) {
                d += map2.get(arr[j]);
            }
            c = Integer.parseInt(d);
            list2.add(c);
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
            if(i % 10 == 9){
                System.out.println();
            }
        }
    }
}

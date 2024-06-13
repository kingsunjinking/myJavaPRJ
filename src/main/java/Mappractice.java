import java.util.*;

public class Mappractice {
    public static void main(String[] args) {

        List<Map<String,Integer>> list = new ArrayList<>();
        Map<String,Map<String,Integer>> student = new HashMap<>();
        Map<String,Integer> grades = new HashMap<>();

        grades.put("Math" ,85);
        list.add(grades);
        grades.put("Math" ,78);
        list.add(grades);
        grades.put("Math" ,95);
        list.add(grades);
        grades.put("Math" ,82);
        list.add(grades);

        student.put("Jone",list.get(0));
        student.put("Jane",list.get(1));
        student.put("Tom",list.get(2));
        student.put("Lucy",list.get(3));

        student.entrySet().forEach(st -> System.out.println(st.getValue() + " " + st.getKey()));

        }
    }


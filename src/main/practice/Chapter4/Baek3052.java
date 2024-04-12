import java.util.*;

public class Baek3052 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = new int[10];
        Set<Integer> ls = new HashSet<>();      //중복값을 받지 않는 리스트 Set으로 생성
        for (int i = 0; i <10; i++){
            arr [i] = s.nextInt();
        }

        for(int i =0; i < 10; i++){
            ls.add(arr[i]%42);
        }
        System.out.println(ls.size());

    }
}

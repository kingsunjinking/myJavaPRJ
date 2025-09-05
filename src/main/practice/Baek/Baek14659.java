import java.util.*;

public class Baek14659 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        List<Integer> list = new ArrayList<>();

        int [] arr = new int[a];

        for (int i = 0; i <a; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            int cnt = 0;
            for (int j = 1; j < arr.length -i; j++) {
                if(arr[i] > arr[i+j]){
                    cnt++;
                }
                else{
                    break;
                }
            }
            list.add(cnt);
        }

        Collections.sort(list);

        System.out.println(list.get(list.size()-1));
    }
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baek1427 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        Integer arr[] = new Integer[str.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        Arrays.sort(arr, Comparator.reverseOrder());        //sort를 통한 배열 내림차순 정렬, 사용하려면 배열을 Integer 형식으로 만들어야함

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}

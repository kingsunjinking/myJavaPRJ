import java.util.Arrays;
import java.util.Scanner;

public class Baek2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[9];  //크기가 9인 배열 생성

        for(int i =0; i < 9; i++){
            arr[i] = s.nextInt();  //배열 값 입력 받음 9번
        }

        System.out.println(Arrays.stream(arr).max().getAsInt());    //배열 내 최대값 찾아서 출력

        for(int j =0; j < arr.length; j++){
            if(arr[j] == Arrays.stream(arr).max().getAsInt()){      //배열 내 최대값이 몇번째인지 출력
                System.out.println(j+1);}
        }
    }
}

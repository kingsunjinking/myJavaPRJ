import java.util.Arrays;
import java.util.Scanner;

public class Baek10818 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int [] arr = new int[a];   //크기가 a(입력값)인 배열 생성

        for(int i=0; i < arr.length; i++){
            arr[i] = s.nextInt();   // 입력값을 배열에 넣음
        }
        Arrays.sort(arr);           //배열을 오름차순으로 정렬
        System.out.print(arr[0] + " " + arr[arr.length-1]);      //배열 내 최대값,최소값 출력
    }
}

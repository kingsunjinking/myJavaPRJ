import java.util.ArrayList;
import java.util.Scanner;

public class Baek10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int[] arr = new int[a]; //크기가 a(입력값)인 배열 생성
        ArrayList<Integer> list = new ArrayList<>(); //크기 제한이 없는 리스트 생성

        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();       //입력값을 배열에 넣음
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < b) {           //배열 내 값이 b보다 작을때마다 리스트에 넣음
                list.add(arr[j]);
            }
        }
        for (int q = 0; q < list.size(); q++) {         //리스트는 그냥 출력하면 []랑 ,도 같이 나옴
            System.out.print(list.get(q)+" ");          //리스트 안의 값 반복문 이용해서 하나씩 출력
        }
    }
}

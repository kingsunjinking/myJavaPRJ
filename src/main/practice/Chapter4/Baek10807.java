import java.util.Scanner;

public class Baek10807 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int[] arr = new int[a];  //크기가 a인 배열 생성

        int count = 0;          //같은 숫자 개수 셀 변수

        for(int i=0; i<a; i++){
            arr[i] = s.nextInt();   //입력값을 배열에 집어넣음
        }
        int b= s.nextInt();         //정수 입력
        
        
        for(int j=0; j < arr.length; j++){
            if(b==arr[j]){          //배열 내 값이 b랑 같을 경우 count 1씩 추가
                count++;}
            }
        System.out.println(count);  //같은 숫자 몇개인지 출력
        }
    }


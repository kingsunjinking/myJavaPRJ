import java.util.Arrays;
import java.util.Scanner;

public class Baek1546 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();    
        Double arr[] = new Double[a];   //크기가 a인 배열 생성 소수점 구하기 위해 double
        double avg = 0;

        for(int i =0; i < a; i++){
            arr[i] = s.nextDouble(); // 입력값 배열에 집어넣기
        }
        
        Arrays.sort(arr);   //배열 오름차순 정렬

        for(int j =0; j < arr.length; j++){
           avg += arr[j] / arr[arr.length-1] * 100; //배열 앞에서 부터 /최대값 *100 해서 avg변수에 추가
        } System.out.println(avg/a);    // avg 나누기 과목 수로 평균값 출력
    }
}

import java.util.Scanner;

public class Baek10988 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();              //문자열 입력받을 스캐너
        String x = "";                          //입력받은 문자열 거꾸로 할 변수 x
        for(int i = str.length(); i > 0 ; i--){
            x += String.valueOf(str.charAt(i-1));   //입력 받은 문자열을 뒤에서 한 문자단위로 문자열로 변환 후 x에 추가
        }
        if(x.equals(str) == true){              //x 와 str 비교 (문자열끼리 비교는 equals를 써야함)
            System.out.println("1");            //참일 경우 1
        }
        else {
            System.out.println("0");            //거짓일 경우 0
        }

    }
}

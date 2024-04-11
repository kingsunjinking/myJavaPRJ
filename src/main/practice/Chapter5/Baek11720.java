import java.util.Scanner;

public class Baek11720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String str = s.next();
        int hap = 0;
        for(int i = 0; i<a; i++){
            hap += Character.getNumericValue(str.charAt(i));        //문자열이 아닌 문자를 정수로 변환할 때
        }                                                           //사용하는 명령어
        System.out.println(hap);
    }
}

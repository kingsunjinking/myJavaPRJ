import java.util.Scanner;

public class Baek1157 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[] arr = new char[26];          //알파벳 넣을거라 26칸 문자배열 생성
        int x = 97;                         //아스키코드 소문자 a는 97부터 시작
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (char) x;              //배열 안에 알파벳 집어넣음 (char)로 아스키코드 문자로 변환
            x++;
        }

        String str = s.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (str.charAt(i) == arr[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

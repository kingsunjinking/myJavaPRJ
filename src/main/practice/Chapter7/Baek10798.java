import java.util.Scanner;

public class Baek10798 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "";

        char[][] arr = new char[5][15];             //행이 5 열이 15인 2차원 배열 생성

        for(int i = 0; i < 5; i++) {
            String a = s.next();                    //행의 수 만큼 str 입력받음
            for (int j = 0; j < a.length(); j++) {  //str 입력 받은거 charAt으로 문자로 변환해서
                char b = a.charAt(j);               //2차원 배열에 넣음
                arr[i][j] = b;}
        }
        for(int j = 0; j < 15; j++) {               //세로로 읽을거라서 for문 순서 바꿈
            for (int i = 0; i < 5; i++) {           //if를 써서 지정 된 배열 값이 빈칸이 아닐경우 str에 한글자씩 추가
                if( arr[i][j] != '\u0000' ) {       //char의 널값은 \u0000으로 표시함 char형이라서 작은따옴표
                    str += arr[i][j];
                }
            }
        }
        System.out.println(str);                    //str 출력
    }
}
import java.util.Scanner;

public class Code05_08 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("점수를 입력하세요");
        int score = s.nextInt();

        if (score >= 90){
            System.out.print("A" + "학점입니다");
        }
        else if(score >= 80 && score < 90){
            System.out.print("B" + "학점입니다");
        }
        else if(score >= 70 && score < 80){
            System.out.print("C" + "학점입니다");
        }
        else if(score >= 60 && score < 70){
            System.out.print("D" + "학점입니다");
        }
        else {
            System.out.print("F" + "학점입니다");
        }
    }
}

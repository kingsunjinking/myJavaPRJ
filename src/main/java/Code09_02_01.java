import java.util.Scanner;

public class Code09_02_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numAry = new int[4];
        int hap = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("숫자 : ");
            numAry[i] = s.nextInt();
            hap += numAry[i];
        }
        System.out.println("합계 ==>" + hap);
        for(int i : numAry){
            System.out.print(i + " ");
        }
        }
    }


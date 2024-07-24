import java.util.Scanner;

public class Baek1100 {         //하얀 칸 위의 체스말 구하기
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int count = 0;
        boolean color = false;

        for (int i = 0; i < 8; i++) {
            String a = s.nextLine();
            if (color == true) {
                color = false;
            } else if (color == false) {
                color = true;
            }
            for (int j = 0; j < 8; j++) {
                if (a.charAt(j) == 'F' && color == true) {
                    count++;
                }

                if (color == true) {
                    color = false;
                } else if (color == false) {
                    color = true;
                }
            }
        }
        System.out.println(count);
    }
}

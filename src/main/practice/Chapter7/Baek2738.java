import java.util.Scanner;

public class Baek2738 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];            //행이 n 열이 m인 2차원 배열 생성

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = s.nextInt();
                arr[i][j] = a;                  //for문을 통해 입력값을 2차원 배열에 저장
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int b = s.nextInt();
                arr[i][j] += b;                 //두번째 for문을 통해 입력값을 처음에 만든 2차원 배열에 더함
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();               //첫번째 배열에 두번째 입력값을 더한 값을 공백을 두고 출력
        }
    }
}

import java.util.Scanner;

public class Codingtest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count = 0;
        int[][] arr = new int[a][3];

        for (int i = 0; i < a; i++) {
            arr[i][0] = s.nextInt();
            arr[i][1] = s.nextInt();
            arr[i][2] = s.nextInt();
        }

        for (int i = 0; i < a; i++) {
            if ((arr[i][0] != 1 || arr[i][1] < 17) || (arr[i][1] <= 18 && arr[i][2] != 1)) {
                count++;
            }

        }
                System.out.println(count);
        for (int i = 0; i < a; i++) {
            if ((arr[i][0] != 1 || arr[i][1] < 17) || (arr[i][1] <= 18 && arr[i][2] != 1)) {
                int b = i + 1;
                    System.out.print(b + " ");
                }
            }
        }
    }


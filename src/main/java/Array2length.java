import java.util.Scanner;

public class Array2length {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int row = s.nextInt();
        int column = s.nextInt();
        int[][] a = new int[row][column];

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                a[i][j] = s.nextInt();
                a[i][a[a.length-1].length-1] += a[i][j];
                a[a.length-1][j] += a[i][j];
                a[a.length-1][a[a.length-1].length-1] += a[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

public class LastTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 11; i++) {

            if (i <= 6) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            if (i > 6) {
                for (int j = 12; j > i; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
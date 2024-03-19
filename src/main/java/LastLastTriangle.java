public class LastLastTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++) {
            if (i <= 7) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            if (i > 7) {
                for (int j = 14; j > i; j--) {
                    System.out.print("*");
                }
            }System.out.println();
        }
    }
}

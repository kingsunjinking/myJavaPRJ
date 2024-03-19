public class Myselftriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {

            if (i <= 4) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }

            if (i >4) {
                for(int j = 8; j > i; j--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
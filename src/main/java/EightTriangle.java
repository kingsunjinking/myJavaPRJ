public class EightTriangle {
    public static void main(String[] args){
        for(int i = 1; i <= 15; i++){

            if(i <= 8){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
            }

            if(i > 8){
                for(int j = 16; j > i; j--){
                    System.out.print("*");
                }
            }System.out.println();
        }
    }
}

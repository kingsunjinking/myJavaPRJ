public class TriangleEasyKK {
    public static void main(String[] args){
        for (int i=1; i <=25; i++){

            if(i<=13) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            if(i>13){
                for(int j = 26; j > i; j--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
public class Hello {
    public static void main(String[] args) {
        for(int i=2, j=1; i<=9; j++) {
            System.out.printf("%d * %d = %d\t",i, j, i*j);
            if(j==9) {
                i++;
                j=0;
                System.out.println();
            }
        }
    }
}
public class Quiz240521 {
    public static void main(String[] args) {
        for (int i = 2; i <=9 ; i++) {                          //2부터 9까지 반복되는 포문
            System.out.printf("%2d X%2d =%2d ",i,1,i*1);          //i x 1 출력
            System.out.printf("%2d X%2d =%2d ",i,2,i*2);          //i x 2 출력
            System.out.printf("%2d X%2d =%2d ",i,3,i*3);          //i x 3 출력
            System.out.printf("%2d X%2d =%2d ",i,4,i*4);          //i x 4 출력
            System.out.printf("%2d X%2d =%2d ",i,5,i*5);          //i x 5 출력
            System.out.printf("%2d X%2d =%2d ",i,6,i*6);          //i x 6 출력
            System.out.printf("%2d X%2d =%2d ",i,7,i*7);          //i x 7 출력
            System.out.printf("%2d X%2d =%2d ",i,8,i*8);          //i x 8 출력
            System.out.printf("%2d X%2d =%2d ",i,9,i*9);          //i x 9 출력
            System.out.println();                               //줄바꿈 후 반복
        }
    }
}

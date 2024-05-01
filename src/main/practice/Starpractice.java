import java.util.Scanner;

public class Starpractice {
    public static void main(String[] args) {
        //for문 4개로 마름모 찍기 2O^2 = O^2
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < a + i; j++) {
                if(a - i <= j + 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int i = a - 2; i > -1; i--) {
            for(int j = 0; j < a + i; j++) {
                if(a - i <= j + 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

//for문 2개로 마름모 찍기 O^2
        for(int i = 0; i < a * 2 - 1; i++) {
            for(int j = 0; j < a * 2 - 1; j++) {
                if(Math.abs(i - a + 1) + Math.abs(j - a + 1) < a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

// for문 하나로 마름모 찍기 On
//        for(int i = 0; i < a * 2 - 1; i++) {
//            int spaces = Math.abs(a - i -1);
//            int stars = a * 2 - 1 - 2 * spaces;
//            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
//        }
    }
}

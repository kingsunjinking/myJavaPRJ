import java.util.Scanner;

public class Baek2896 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double [] fruit = new double[3];
        double [] per = new double[3];
        int a = 0;
        for (int i = 0; i < 3; i++) {
            fruit[i] = s.nextDouble();
        }
        for (int i = 0; i < 3; i++) {
            per[i] = s.nextDouble();
        }
        int j = 0;
        int p = 0;
        while (true){
            fruit[j] = fruit[j] - per[j];
            j++;
            if(j == 3){
                j = 0;

            if (fruit[j] < per[j]){
                p = j;
                break;
            }

            }
        }
        for (int i = 0; i < 3; i++) {
            fruit[j] = fruit[j] - (fruit[p]+(fruit[p]/per[p]));
            if(j == 3){
                j = 0;
            }
            if (fruit[j] <= 0){
                System.out.println(a);
            }
            else {
                System.out.println(fruit[j] + " ");
            }
        }

    }
}

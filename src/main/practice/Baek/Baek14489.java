import java.util.Scanner;

public class Baek14489 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int kb = s.nextInt();
        int toss = s.nextInt();

        int chiken = s.nextInt();

        if(chiken*2 <= kb+toss){
            System.out.println(kb+toss - (chiken*2));
        } else{
            System.out.println(kb+toss);
        }
    }
}

import java.util.Scanner;

public class Baek1316 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            String st  = s.nextLine();
            for (int j = 0; j < st.length(); j++) {
                if(j==st.length()-1){
                    break;
                }
                else if(st.charAt(j) == st.charAt(j+1)){
                    count++;
                    break;
                }
            }
        }System.out.println(count);
    }
}

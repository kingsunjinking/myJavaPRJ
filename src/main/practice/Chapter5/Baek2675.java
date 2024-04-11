import java.io.*;
import java.util.Scanner;

public class Baek2675 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < a; i++) {
            //int b = s.nextInt();
            String str = br.readLine();
            for (int j = 2; j < str.length(); j++) {
                for (int p = 0; p < Character.getNumericValue(str.charAt(0)); p++) {
                    bw.write(str.charAt(j));
                }
            }bw.write("\n");
        }
        bw.flush();
    }
}

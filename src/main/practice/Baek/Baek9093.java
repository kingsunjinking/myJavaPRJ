import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek9093 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            String [] arr = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < arr.length; j++) {
                sb.append(new StringBuilder(arr[j]).reverse().append(" "));
            }

            bw.write(sb.toString().trim() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

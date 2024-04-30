import java.io.*;

public class ProgrammersB {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        String after = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == str.toUpperCase().charAt(i)) {
                after += str.toLowerCase().charAt(i);

            } else {
                after += str.toUpperCase().charAt(i);

            }
            bw.write(after.charAt(i));
        }

        bw.flush();
        bw.close();
        br.close();



    }
}

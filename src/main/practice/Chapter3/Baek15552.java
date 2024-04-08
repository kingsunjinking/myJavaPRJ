import java.io.*;
import java.util.StringTokenizer;

public class Baek15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));    /// 3 8

        int a = Integer.parseInt(br.readLine());

                for(int i = 0; i < a; i++){
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    int z = Integer.parseInt(st.nextToken());
                    int x = Integer.parseInt(st.nextToken());
                    int p = z+x;
                    bw.write(p + "\n");
                }
                bw.flush();
        }
    }


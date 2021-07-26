import java.io.*;

public class Main15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i=0;i<T;i++) {
            String[] T1 = br.readLine().split(" ");
            int T3 = Integer.parseInt(T1[0]) + Integer.parseInt(T1[1]);
            bw.write(T3+"\n");
        }
        bw.flush();
        bw.close();
    }
}

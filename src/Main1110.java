import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1110 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = 0;
        int z = 0;
        int cnt = 0;
        if (x < 10) {
            x = x * 10;
        }
        z = x;
        while (true) {
            y = z / 10 + z % 10;
            if (y >= 10) {
                z = y % 10 + (z % 10) * 10;
            } else if (y < 10) {
                z = y + (z % 10) * 10;
            }
            cnt++;
            if (x == z) {
                break;
            }
        }
        System.out.println(cnt);
    }
}

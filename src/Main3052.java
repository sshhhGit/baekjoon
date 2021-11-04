import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, cnt = 0;
        boolean[] str = new boolean[42];
        for (int i = 0; i < 10; i++){
            a = Integer.parseInt(br.readLine());
            str[a%42] = true;
        }
        for (int i = 0; i < 42; i++){
            if (str[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

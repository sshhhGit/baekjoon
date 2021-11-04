import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, cnt = 0;
        String[] str = new String[10];
        for (int i = 0; i < 10; i++){
            a = Integer.parseInt(br.readLine());
            b = a%42;
            str[i] = String.valueOf(b);
            if (str[i].equals(b) ){
                System.out.println("ㅇㅇ");
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println(Arrays.toString(str));
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main4344 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int score = 0;
        double average = 0;
        double cnt = 0;
        for (int i = 0; i < a; i++){
            int[] b = new int[Integer.parseInt(br.readLine())];
            for (int j = 0; j < b.length; j++){
                b[j] = Integer.parseInt(br.readLine());
                score += b[j];
                average = score/b.length;
            }
            for (int j = 0; j < b.length; j++){
                if(b[j] > average ){
                    cnt += 1;
                }
            }

            System.out.println(Arrays.toString(b));
            System.out.println(cnt);
            System.out.println(b.length);
            System.out.println((cnt/b.length)*100+"%");
            System.out.printf("%5d",(cnt/b.length)*100);
        }
    }
}

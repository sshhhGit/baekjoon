import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4344 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++){
            int score = 0;
            double average = 0;
            double cnt = 0;

            String b = br.readLine();
            String arr[] = b.split(" ");
            int student = Integer.parseInt(arr[0]);

            for (int j = 1; j < arr.length; j++){
                score += Integer.parseInt(arr[j]);
                average = score/student;
            }
            for (int j = 1; j < arr.length; j++){
                if(Integer.parseInt(arr[j]) > average ){
                    cnt += 1;
                }
            }
            System.out.println(String.format("%.3f", (cnt/student)*100)+"%");
        }
    }
}

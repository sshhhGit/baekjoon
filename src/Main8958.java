import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main8958 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] b;
        for (int i = 0; i < a; i++){
            int score = 0;
            int c = 1;
            b = (br.readLine()).split("");
            for (int j = 0; j < b.length; j++){
                if(b[j].equals("O")){
                    score += c;
                    c++;
                } else if(b[j].equals("X")){
                    c = 1;
                }
            }
            System.out.println(score);
        }
    }
}

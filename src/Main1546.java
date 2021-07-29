import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] strs = bf.readLine().split(" ");
        double[] array = new double[N];
        double top = 0;
        double sum = 0;
        for (int i=0; i<N;i++){
            array[i] = Integer.parseInt(strs[i]);
            if (top<array[i]){
                top = array[i];
            }
        }
        for (int i=0;i<N;i++){
            sum += (array[i] / top)*100;
        }
            double result = sum/N;
        System.out.printf("%.6f%n",result);
    }
}

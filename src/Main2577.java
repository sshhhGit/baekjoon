import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = bufferedReader.readLine();

        int num = Integer.parseInt(a)*Integer.parseInt(b)*Integer.parseInt(c);

        String str = String.valueOf(num);

        System.out.println(countChar(str, '0')); // 1
        System.out.println(countChar(str, '1')); // 2
        System.out.println(countChar(str, '2')); // 1
        System.out.println(countChar(str, '3')); // 1
        System.out.println(countChar(str, '4')); // 0
        System.out.println(countChar(str, '5')); // 0
        System.out.println(countChar(str, '6')); // 0
        System.out.println(countChar(str, '7')); // 0
        System.out.println(countChar(str, '8')); // 0
        System.out.println(countChar(str, '9')); // 0
    }
    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
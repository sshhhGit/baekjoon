import java.util.Scanner;

public class Main11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int sum = 0;
        for (int i=0;i<N;i++){
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;

public class Main2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Array = new int[9];
        int max = 0;
        int n = 0;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scanner.nextInt();
            if (max < Array[i]) {
                max = Array[i];
                n = i+1;
            }
        }
        System.out.println(max+"\n"+n);
    }
}
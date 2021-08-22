import java.util.*;

public class Main10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, y;
        n = sc.nextInt();
        x = sc.nextInt();
        for(int i=1; i<=n; i++) {
            y = sc.nextInt();
            if(y<x) {
                System.out.println(y);
            }
        }
    }
}

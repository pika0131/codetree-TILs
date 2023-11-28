import java.util.*;

public class Main {
    static int max;

    public static void LCM(int n, int m) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0) {
                max = i;
            }
        }
        System.out.println(max * (n / max * m / max));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        LCM(n, m);
    }
}
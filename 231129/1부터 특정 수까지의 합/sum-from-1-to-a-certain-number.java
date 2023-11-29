import java.util.*;

public class Main {
    static int max;

    public static int cal(int n) {
        return n / 10;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(cal(sum));
    }
}
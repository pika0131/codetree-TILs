import java.util.*;

public class Main {
    public static boolean is369(int n) {
        while (n > 0) {
            if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static boolean istrue(int n) {
        return is369(n) || (n % 3 == 0);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (istrue(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
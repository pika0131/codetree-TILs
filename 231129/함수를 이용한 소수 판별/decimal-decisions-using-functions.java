import java.util.*;

public class Main {
    public static boolean isprime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0||n==0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (isprime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
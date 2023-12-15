import java.util.Scanner;

public class Main {
    public static int cal(int n) {
        if (n < 10) {
            return n * n;
        }
        int num = (n % 10);
        return cal(n / 10) + num * num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cal(n));
    }
}
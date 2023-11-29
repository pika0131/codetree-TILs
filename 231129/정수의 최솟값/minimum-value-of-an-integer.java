import java.util.*;

public class Main {
    static int max;

    public static int cal(int a, int b, int c) {
        int small = 101;
        if (a < small) {
            small = a;
        } else if (b < small) {
            small = b;
        } else if (c < small) {
            small = c;
        }
        return small;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int small = cal(a, b, c);
        System.out.println(small);
    }
}
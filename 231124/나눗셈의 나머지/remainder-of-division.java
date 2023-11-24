import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[1000];
        int[] cnt = new int[9];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (true) {
            if (a <= 1) {
                break;
            }
            list[count] = a % b;
            a = a / b;
            cnt[list[count]]++;
            count++;
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += cnt[i] * cnt[i];
        }
        System.out.println(sum);
    }
}
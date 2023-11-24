import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (i == list.length - 1) {
                break;
            }
            if (Math.abs(list[i] - list[i + 1]) < MIN) {
                MIN = Math.abs(list[i] - list[i + 1]);
            }
        }
        System.out.println(MIN);
    }
}
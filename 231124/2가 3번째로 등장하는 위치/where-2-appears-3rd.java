import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 2) {
                cnt++;
                if (cnt == 3) {
                    System.out.print(i + 1);
                    break;
                }
            }
        }
    }
}
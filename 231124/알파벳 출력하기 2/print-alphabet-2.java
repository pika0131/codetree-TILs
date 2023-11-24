import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        char cnt = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (i + 1) - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - (i + 1) + 1; j++) {
                System.out.print(cnt + " ");
                cnt++;
                if (cnt > 'Z') {
                    cnt = 'A';
                }
            }
            System.out.println();
        }
    }
}
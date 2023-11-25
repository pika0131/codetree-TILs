import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] list = new int[100][100];
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    list[j][i] = cnt;
                    cnt++;
                }
            } else if (i % 2 != 0) {
                for (int j = n - 1; j >= 0; j--) {
                    list[j][i] = cnt;
                    cnt++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int n = Integer.parseInt(br.readLine());
        int[][] list = new int[n][n];
        boolean direction = true;
        int num = 1, i = n - 1, j = n - 1;

        while (num <= n * n) {
            list[i][j] = num++;
            if (direction) {
                if (i > 0) {
                    i--;
                } else {
                    j--;
                    direction = !direction;
                }
            } else {
                if (i < n - 1) {
                    i++;
                } else {
                    j--;
                    direction = !direction;
                }
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}
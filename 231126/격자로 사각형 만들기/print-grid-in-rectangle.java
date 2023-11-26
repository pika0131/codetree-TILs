import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int n = Integer.parseInt(br.readLine());
        int[][] list = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    list[i][j] = 1;
                } else {
                    list[i][j] = list[i - 1][j] + list[i][j - 1] + list[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] list = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 0) {
                    list[i][j] = 1;
                } else {
                    list[i][j] = list[i - 1][j] + list[i][j - 1];
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}
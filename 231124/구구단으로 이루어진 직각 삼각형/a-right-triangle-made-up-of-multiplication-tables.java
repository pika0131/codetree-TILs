import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                if (j == n - i) {
                    sb.append(i + 1 + " * " + j + " = " + j * (i + 1));

                } else {
                    sb.append(i + 1 + " * " + j + " = " + j * (i + 1) + " / ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
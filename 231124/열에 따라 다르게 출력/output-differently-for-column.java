import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 != 0) {
                    cnt++;
                    sb.append(cnt + " ");
                } else if (i % 2 == 0) {
                    cnt += 2;
                    sb.append(cnt + " ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
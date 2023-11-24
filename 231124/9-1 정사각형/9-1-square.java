import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int cnt = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt == 1) {
                    sb.append(cnt);
                    cnt = 9;
                    continue;
                }
                sb.append(cnt);
                cnt--;

            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
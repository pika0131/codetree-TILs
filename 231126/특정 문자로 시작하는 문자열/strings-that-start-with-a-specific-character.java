import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static double sum = 0;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = br.readLine();
        }
        String str = br.readLine();
        for (int i = 0; i < n; i++) {
            if (list[i].contains(str)) {
                cnt++;
                sum += list[i].length();
            }
        }
        System.out.print(cnt + " ");
        System.out.printf("%.2f", (sum / cnt));
    }
}
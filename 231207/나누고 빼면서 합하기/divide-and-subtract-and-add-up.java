import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int m;
    static int[] list;

    public static int cal(int[] list) {
        int total = 0;
        while (true) {
            if (m == 1) {
                total += list[m];
                break;
            }
            if (m % 2 != 0) {
                total += list[m];
                m -= 1;
            } else {
                total += list[m];
                m /= 2;
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        list = new int[n + 1];
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(cal(list));
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int[] list = new int[101];
    static int a1, a2;

    public static int cal() {
        int sum = 0;
        for (int i = a1; i <= a2; i++) {
            sum += list[i];
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            a1 = Integer.parseInt(st.nextToken());
            a2 = Integer.parseInt(st.nextToken());
            sb.append(cal() + "\n");
        }
        System.out.println(sb);
    }
}
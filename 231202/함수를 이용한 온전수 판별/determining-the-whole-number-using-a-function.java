import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean cal(int i) {
        if (i % 2 == 0) {
            return false;
        } else if (i % 10 == 5) {
            return false;
        } else if (i % 3 == 0 && i % 9 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for (int i = a; i <= b; i++) {
            if (cal(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
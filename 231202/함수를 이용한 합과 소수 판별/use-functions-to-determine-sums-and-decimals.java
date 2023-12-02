import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean cal(int i) {
        if (isPrime(i) && odd(i)) {
            return true;
        }
        return false;
    }

    static boolean isPrime(int i) {
        if (i == 1) {
            return false;
        }
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean odd(int i) {
        int sum = (i / 100) + ((i / 10) % 10) + (i % 10);
        if (sum % 2 == 0) {
            return true;
        }
        return false;
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
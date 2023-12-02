import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n1;
    static int n2;
    static int[] a = new int[100];
    static int[] b = new int[100];

    public static boolean cal(int n) {
        for (int i = 0; i < n2; i++)
            if (a[i + n] != b[i])
                return false;

        return true;
    }

    public static boolean isSubsequence() {
        for (int i = 0; i <= n1 - n2; i++)
            if (cal(i))
                return true;

        return false;
    }

    public static void main(String[] args) throws IOException {
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n1; i++)
            a[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++)
            b[i] = Integer.parseInt(st.nextToken());
        if (isSubsequence()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static boolean isValid(int M, int D) {
        if (M == 2) {
            if (D > 28) {
                return false;
            } else {
                return true;
            }
        }
        if (M > 12) {
            return false;
        }
        if (D > 31) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        if (isValid(M, D)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
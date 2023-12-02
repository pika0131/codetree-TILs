import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static boolean isValid(int M, int D) {
        //1 3 5 7 8 10 12
        //4 6 9 11//
        //2
        if (M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12) {
            if (D > 31) {
                return false;
            } else {
                return true;
            }
        } else if (M == 4 || M == 6 || M == 9 || M == 11) {
            if (D > 30) {
                return false;
            } else {
                return true;
            }
        } else if (M == 2) {
            if (D > 28) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
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
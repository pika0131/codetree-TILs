import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        System.out.println(cal(a, b));
    }

    private static int cal(String A, String B) {
        if (A.length() != B.length()) {
            return -1;
        }
        for (int i = 0; i < A.length(); i++) {
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
            if (A.equals(B)) {
                return i + 1;
            }
        }

        return -1;
    }
}
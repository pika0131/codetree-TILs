import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int fbo(int a, String o, int c) {
        switch (o) {
            case "+":
                return a + c;
            case "-":
                return a - c;
            case "/":
                return a / c;
            case "*":
                return a * c;
            default:
                return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        String o = st.nextToken();
        int c = Integer.parseInt(st.nextToken());
        int result = fbo(a, o, c);
        if (result != 0) {
            System.out.println(a + " " + o + " " + c + " = " + result);
        } else {
            System.out.println("False");
        }
    }
}
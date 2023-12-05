import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static boolean swap(String str) {
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (swap(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
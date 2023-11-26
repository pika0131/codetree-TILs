import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static double sum = 0;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = br.readLine();
        String str2 = br.readLine();
        String ab = str1 + str2;
        String ba = str2 + str1;
        if (ab.equals(ba)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
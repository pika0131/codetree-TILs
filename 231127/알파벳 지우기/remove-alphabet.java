import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int sum = 0;
        int sum2 = 0;
        for (char c : str1.toCharArray()) {
            if (Character.isDigit(c)) {
                sum = sum * 10 + Character.getNumericValue(c);
            }
        }
        for (char c : str2.toCharArray()) {
            if (Character.isDigit(c)) {
                sum2 = sum2 * 10 + Character.getNumericValue(c);
            }
        }
        System.out.println(sum + sum2);
    }
}
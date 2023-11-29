import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();
        long dup = 0;
        for (int i = 0; i < str2.length(); i++) {
            dup += finddup(str, str2.charAt(i)) - 1;
        }
        System.out.println(str2.length() - dup);
    }

    public static long finddup(String str, char ch) {
        return str.chars().
                filter(c -> c == ch)
                .count();
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();
        Stack<Character> st = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (!st.isEmpty()) {
                if (st.peek() == str2.charAt(i)) {
                    st.pop();
                    continue;
                }
            }
            cnt++;
            st.push(str2.charAt(i));
        }
        System.out.println(cnt);
    }
}
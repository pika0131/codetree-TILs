import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] list = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            list[i] = str.charAt(i);
        }
        Arrays.sort(list);
        String strfinal = new String(list);
        System.out.println(strfinal);
    }
}
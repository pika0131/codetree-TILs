import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        char[] list = str1.toCharArray();
        String str2 = br.readLine();
        char[] list2 = str2.toCharArray();
        Arrays.sort(list);
        Arrays.sort(list2);
        String nstr1 = new String(list);
        String nstr2 = new String(list2);
        if (nstr2.equals(nstr1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
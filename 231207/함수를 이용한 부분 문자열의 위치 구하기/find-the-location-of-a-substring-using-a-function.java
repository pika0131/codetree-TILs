import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static String str, str2;

    public static int findidx() {
        int idx = str.indexOf(str2);
        return idx;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        str2 = br.readLine();
        int index = findidx();
        System.out.println(index);
    }
}
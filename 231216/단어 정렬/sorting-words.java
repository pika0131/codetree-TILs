import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = br.readLine();
        }
        Arrays.sort(list);
        for (String i : list) {
            System.out.println(i);
        }
    }
}
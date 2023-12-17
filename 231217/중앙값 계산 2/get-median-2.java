import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 != 0) {
                list[i] = Integer.parseInt(st.nextToken());
                int[] copy = Arrays.copyOf(list, i + 1);
                Arrays.sort(copy);
                System.out.print(copy[i / 2] + " ");
            } else {
                list[i] = Integer.parseInt(st.nextToken());
            }
        }

    }
}
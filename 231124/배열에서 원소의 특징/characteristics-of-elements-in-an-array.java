import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 10; i++) {
            if (list[i] % 3 == 0) {
                System.out.print(list[i]);
                break;
            }
        }
    }
}
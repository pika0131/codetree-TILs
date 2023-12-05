import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] list = new int[100];

    static void abs(int[] list2) {
        for (int i = 0; i < list2.length; i++) {
            if (list2[i] < 0) {
                list2[i] = -list2[i];
            }
        }
        return;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        abs(list);
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
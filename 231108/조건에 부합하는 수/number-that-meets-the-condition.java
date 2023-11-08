import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0 && i % 4 != 0) {
				continue;
			} else if ((i / 8) % 2 == 0) {
				continue;
			} else if (i % 7 < 4) {
				continue;
			}
			sb.append(i + " ");
		}
		System.out.println(sb);
	}
}
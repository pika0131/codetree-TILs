import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(br.readLine());
		while (true) {
			cnt++;
			if (a / cnt <= 1) {
				break;
			}
			a /= cnt;
		}
		System.out.println(cnt);
	}
}
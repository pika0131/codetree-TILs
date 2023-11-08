import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static double ave = 0;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		while (true) {
			double a = Double.parseDouble(br.readLine());
			if (a > 29 || a < 20) {
				if (cnt == 0) {
					cnt = 1;
					break;
				}
				break;
			}
			ave += a;
			cnt++;
		}
		System.out.printf("%.2f", ave / cnt);
	}
}
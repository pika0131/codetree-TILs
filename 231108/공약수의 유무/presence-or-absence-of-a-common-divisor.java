import java.util.Scanner;

public class Main {
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			if (1920 % i == 0 && 2880 % i == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
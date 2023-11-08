import java.util.Scanner;

public class Main {
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[5];
		for (int i = 0; i < 5; i++) {
			list[i] = sc.nextInt();
		}
		for (int i : list) {
			if (i % 3 == 0) {
				cnt++;
			} else {
				break;
			}
		}
		if (cnt == 5) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
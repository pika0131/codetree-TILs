import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int plus = 1;
		int minus = n;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < plus; j++) {
					System.out.print("* ");
				}
				System.out.println();
				plus++;
			} else {
				for (int j = 0; j < minus; j++) {
					System.out.print("* ");
				}
				System.out.println();
				minus--;
			}
		}

		plus = (n / 2) + 1;
		minus = n / 2;

		if (n % 2 == 0) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0) {
					for (int k = 0; k < plus; k++) {
						System.out.print("* ");
					}
					System.out.println();
					plus++;
				} else {
					for (int k = 0; k < minus; k++) {
						System.out.print("* ");
					}
					System.out.println();
					minus--;
				}
			}
		} else {
			for (int k = 1; k <= n; k++) {
				if (k % 2 == 0) {
					for (int j = 0; j < minus; j++) {
						System.out.print("* ");
					}
					System.out.println();
					minus--;
				} else {
					for (int j = 0; j < plus; j++) {
						System.out.print("* ");
					}
					System.out.println();
					plus++;
				}
			}
		}
	}
}
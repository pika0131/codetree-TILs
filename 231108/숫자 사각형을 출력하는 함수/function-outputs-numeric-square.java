import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				int num = (j - 1) * n + i;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
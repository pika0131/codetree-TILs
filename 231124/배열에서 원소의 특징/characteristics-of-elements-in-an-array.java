import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = sc.nextInt();
        }
        for (int i : list) {
            if (list[i] % 3 == 0) {
                System.out.print(list[i - 1]);
                break;
            }
        }
    }
}
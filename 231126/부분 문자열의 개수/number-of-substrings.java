import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        int count = 0;
        for (int i = 0; i <= A.length() - B.length(); i++) {
            if (A.substring(i, i + B.length()).equals(B)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
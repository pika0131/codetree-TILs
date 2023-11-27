import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        int minRotation = findMinimumRotation(A, B);
        System.out.println(minRotation);
    }

    public static int findMinimumRotation(String A, String B) {
        if (A.length() != B.length()) {
            return -1;
        }

        String doubleA = A + A;

        for (int i = 0; i < A.length(); i++) {
            String rotated = doubleA.substring(i, i + A.length());
            if (rotated.equals(B)) {
                return i;
            }
        }

        return -1;
    }
}
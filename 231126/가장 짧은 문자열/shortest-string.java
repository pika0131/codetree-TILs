import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            String str = sc.nextLine();
            if (str.length() < MIN) {
                MIN = str.length();
            }
        }
        System.out.println(MIN);
    }
}
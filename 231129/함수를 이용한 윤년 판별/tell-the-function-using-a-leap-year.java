import java.util.*;

public class Main {
    public static boolean isleaf(int n) {
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (isleaf(year)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
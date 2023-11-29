import java.util.*;

public class Main {
    public static boolean istrue(String str) {
        int num = 0;
        for (int i = 0; i < 2; i++) {
            num += Character.getNumericValue(str.charAt(i));
        }
        return Integer.parseInt(str) % 2 == 0 && num % 5 == 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (istrue(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
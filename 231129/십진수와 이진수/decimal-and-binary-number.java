import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.parseInt(str, 2);
        a *= 17;
        String str2 = Integer.toBinaryString(a);
        System.out.println(str2);
    }
}
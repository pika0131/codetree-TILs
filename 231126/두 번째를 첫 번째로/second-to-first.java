import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll(String.valueOf(str.charAt(1)), String.valueOf(str.charAt(0)));
        System.out.println(str);
    }
}
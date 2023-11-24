import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 2; i <= 8; i += 2) {
            for (int j = b; j >= a; j--) {
                if (j == a) {
                    sb.append(j + " * " + i + " = " + j * i);

                } else {
                    sb.append(j + " * " + i + " = " + j * i + " / ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
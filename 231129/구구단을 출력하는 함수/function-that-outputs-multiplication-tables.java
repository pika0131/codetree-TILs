import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[3];
        list[0] = sc.nextInt();
        list[1] = sc.nextInt();
        list[2] = sc.nextInt();
        Arrays.sort(list);
        for (int i = list[0]; i <= list[2]; i++) {
            if (i == list[1]) {
                continue;
            }
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
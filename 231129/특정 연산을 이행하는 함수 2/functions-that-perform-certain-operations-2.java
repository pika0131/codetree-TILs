import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] list = new double[3];
        list[0] = sc.nextDouble();
        list[1] = sc.nextDouble();
        list[2] = sc.nextDouble();
        Arrays.sort(list);
        int i1 = (int) list[2] + 1;
        int i2 = (int) list[0];
        int i3 = (int) Math.round(list[1]);
        System.out.println(i1 + " " + i2 + " " + i3);
    }
}
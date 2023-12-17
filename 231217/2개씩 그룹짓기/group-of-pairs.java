import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static final int MAX_N = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[2 * MAX_N];

        for(int i = 0; i < 2 * n; i++)
            nums[i] = sc.nextInt();

        Arrays.sort(nums, 0, 2 * n);

        int groupMax = 0;
        for(int i = 0; i < n; i++) {
            int groupSum = nums[i] + nums[2*n - 1 - i];
            if(groupSum > groupMax)
                groupMax = groupSum;
        }

        System.out.print(groupMax);

    }
}
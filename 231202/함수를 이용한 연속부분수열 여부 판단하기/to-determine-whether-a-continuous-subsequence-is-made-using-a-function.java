import java.util.Scanner;

public class Main {    
    
   static int n1, n2;
    static int[] a = new int[100];
    static int[] b = new int[100];
    
    public static boolean check(int n) {
        for(int i = 0; i < n2; i++)
            if(a[i + n] != b[i])
                return false;
    
        return true;
    }
    public static boolean isSubsequence() {
        for(int i = 0; i <= n1 - n2; i++)
            if(check(i))
                return true;
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for(int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        
        for(int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        
        if(isSubsequence())
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
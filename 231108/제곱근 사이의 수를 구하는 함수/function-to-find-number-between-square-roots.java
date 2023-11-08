import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int a1 = (int) Math.sqrt(a);
		int a2 = (int) Math.sqrt(b);
		if(a1>a2){
            System.out.println(a1-a2);
        }else{
            System.out.println(a2-a1);
        }
	}
}
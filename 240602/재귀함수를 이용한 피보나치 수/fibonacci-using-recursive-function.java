import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
     public static void main(String[] args)throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int n = Integer.parseInt(br.readLine());
          int num = fibo(n);
          System.out.println(num);
     }
     public static int fibo(int n){
          if(n==1){
               return 1;
          }
          if(n==2){
               return 1;
          }
          return fibo(n-1)+fibo(n-2);
     }
}
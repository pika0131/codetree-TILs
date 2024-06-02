import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
     public static void main(String[] args)throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int n = Integer.parseInt(br.readLine());
          int num = even_odd(n);
          System.out.println(num);
     }
     public static int even_odd(int n){
          if(n%2==0){
               return even(n);
          }else{
               return odd(n);
          }
     }
     public static int even(int n){
          if(n==2){
               return 2;
          }
          return n+even(n-2);
     }
     public static int odd(int n){
          if(n==1){
               return 1;
          }
          return n+odd(n-2);
     }
}
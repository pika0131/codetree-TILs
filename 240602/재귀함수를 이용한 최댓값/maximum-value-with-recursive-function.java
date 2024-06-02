import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
     static int[] list;
     public static void main(String[] args)throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int n = Integer.parseInt(br.readLine());
          list = new int[n];
          StringTokenizer st = new StringTokenizer(br.readLine());
          for(int i=0;i<n;i++){
               list[i]=Integer.parseInt(st.nextToken());
          }
          System.out.println(big(n));

     }
     public static int big(int n){
          if(n==0){
               return list[0];
          }
          return Math.max(list[n-1],big((n-1)-1));
     }
}
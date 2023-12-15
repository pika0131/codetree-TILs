import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        int[] list2 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int j=0;j<n;j++){
            list2[j]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);
        Arrays.sort(list2);
        for(int i=0;i<n;i++){
            if(list[i]!=list2[i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
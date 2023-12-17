import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class code {
    String str1, str2;
    int num;

    public code(String str1, String str2, int num) {
        this.num = num;
        this.str1 = str1;
        this.str2 = str2;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        int num = Integer.parseInt(st.nextToken());
        code cd = new code(str1, str2, num);
        System.out.println("secret code : " + cd.str1);
        System.out.println("meeting point : " + cd.str2);
        System.out.println("time : " + cd.num);
    }
}
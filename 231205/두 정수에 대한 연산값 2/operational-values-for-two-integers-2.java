import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class tmp {
    int val;

    public tmp(int val) {
        this.val = val;
    }
}

public class Main {
    static void cal(tmp a, tmp b) {
        if (a.val < b.val) {
            a.val += 10;
            b.val *= 2;
        } else {
            a.val *= 2;
            b.val += 10;
        }
        return;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        tmp anum = new tmp(a);
        tmp bnum = new tmp(b);
        cal(anum, bnum);

        a = anum.val;
        b = bnum.val;
        System.out.println(a + " " + b);
    }
}
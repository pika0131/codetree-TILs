import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int idx = str.indexOf("e");
        sb.deleteCharAt(idx);

        System.out.println(sb);
    }
}
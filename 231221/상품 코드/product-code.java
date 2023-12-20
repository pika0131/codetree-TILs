import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

class product {
    String name, code;

    public product() {
        this.name = "codetree";
        this.code = "50";
    }

    public product(String name, String code) {
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        String code = st.nextToken();
        product pd = new product();
        System.out.println("product " + pd.code + " is " + pd.name);
        product pd2 = new product(name, code);
        System.out.println("product " + pd2.code + " is " + pd2.name);
    }
}
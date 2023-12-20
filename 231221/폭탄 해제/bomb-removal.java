import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

class boom {
    String code, color;
    int sec;

    public boom(String code, String color, int sec) {
        this.code = code;
        this.color = color;
        this.sec = sec;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String code = st.nextToken();
        String color = st.nextToken();
        int sec = Integer.parseInt(st.nextToken());
        boom b = new boom(code, color, sec);
        System.out.println("code : " + b.code);
        System.out.println("color : " + b.color);
        System.out.println("second : " + b.sec);
    }
}
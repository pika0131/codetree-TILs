import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

class userinfo {
    String name, lvl;

    public userinfo() {
        this.name = "Codetree";
        this.lvl = "10";
    }

    public userinfo(String name, String lvl) {
        this.name = name;
        this.lvl = lvl;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        String lvl = st.nextToken();
        userinfo usi = new userinfo();
        System.out.println("user " + usi.name + " lv " + usi.lvl);
        userinfo usi2 = new userinfo(name, lvl);
        System.out.println("user " + usi2.name + " lv " + usi2.lvl);
    }
}
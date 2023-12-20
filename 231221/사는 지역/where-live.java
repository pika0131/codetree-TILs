import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

class location {
    String name, add, local;

    public location(String name, String add, String local) {
        this.name = name;
        this.add = add;
        this.local = local;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        location[] loc = new location[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String add = st.nextToken();
            String local = st.nextToken();
            loc[i] = new location(name, add, local);
        }
        int idx = 0;
        for (int i = 1; i < n; i++) {
            if (loc[i].name.compareTo(loc[idx].name) > 0)
                idx = i;
        }
        System.out.println("name " + loc[idx].name);
        System.out.println("addr " + loc[idx].add);
        System.out.println("city " + loc[idx].local);
    }
}
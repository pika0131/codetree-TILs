import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

class AgentInfo {
    String name;
    int score;

    public AgentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        AgentInfo[] ai = new AgentInfo[5];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            ai[i] = new AgentInfo(name, score);
        }
        int minidx = 0;
        for (int i = 1; i < 5; i++) {
            if (ai[minidx].score > ai[i].score) {
                minidx = i;
            }
        }
        System.out.println(ai[minidx].name + " " + ai[minidx].score);
    }
}
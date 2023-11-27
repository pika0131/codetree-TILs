import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String str = br.readLine();
        String command = br.readLine();
        ;
        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            dq.add(str.charAt(i));
        }
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'L') {
                dq.addLast(dq.pollFirst());
            } else {
                dq.addFirst(dq.pollLast());
            }
        }
        for (int i : dq) {
            System.out.print(Character.toString(i));
        }
    }
}
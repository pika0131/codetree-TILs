import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        Character c = br.readLine().charAt(0);
        char sum = (char) (c - 1);
        if (c == 'a') {
            System.out.println("z");
        } else {
            System.out.println(sum);
        }
    }
}
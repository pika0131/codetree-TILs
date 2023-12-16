import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String T = st.nextToken();
        List<String> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(br.readLine());
        }
        List<String> filtered = list.stream()
                .filter(s -> s.startsWith(T))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filtered.get(k - 1));
    }
}
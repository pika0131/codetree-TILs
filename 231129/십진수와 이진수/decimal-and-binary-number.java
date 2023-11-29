import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BigInteger bigInteger = new BigInteger(str, 2);
        bigInteger = bigInteger.multiply(BigInteger.valueOf(17));
        String result = bigInteger.toString(2);
        System.out.println(result);
    }
}
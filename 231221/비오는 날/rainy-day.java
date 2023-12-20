import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

class weather {
    String date, yo, weather;

    public weather(String date, String yo, String weather) {
        this.date = date;
        this.yo = yo;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        weather[] list = new weather[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String date = st.nextToken();
            String yo = st.nextToken();
            String weather = st.nextToken();
            list[i] = new weather(date, yo, weather);
        }
        int date = 0;
        for (int i = 0; i < n; i++) {
            if (list[i].weather.equals("Rain")) {
                if (date == 0) {
                    date = i;
                } else {
                    if (list[date].date.compareTo(list[i].date) > 0) {
                        date = i;
                    }
                }
            }
        }
        System.out.println(list[date].date + " " + list[date].yo + " " + list[date].weather);
    }
}
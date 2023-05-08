package Problem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Problem2 {
    static int getTotalPage(int m, int n) {
        if (m % n == 0) {
            return m / n;
        }
        return m / n + 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(getTotalPage(5, 10)));
        bw.write("\n");
        bw.write(String.valueOf(getTotalPage(15, 10)));
        bw.write("\n");
        bw.write(String.valueOf(getTotalPage(25, 10)));
        bw.write("\n");
        bw.write(String.valueOf(getTotalPage(30, 10)));
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}

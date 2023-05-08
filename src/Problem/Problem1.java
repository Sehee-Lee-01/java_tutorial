package Problem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Problem1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}

// 문제 출처: https://wikidocs.net/237
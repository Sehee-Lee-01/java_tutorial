package Problem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Problem3 {
    static int getDigitCount(int n) {
        // String n_str = String.valueOf(n);
        String n_str = n + "";
        return n_str.length();
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(getDigitCount(3)));
        bw.write("\n");
        bw.write(String.valueOf(getDigitCount(25)));
        bw.write("\n");
        bw.write(String.valueOf(getDigitCount(333)));
        bw.write("\n");
        bw.write(String.valueOf(getDigitCount(7876)));
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}

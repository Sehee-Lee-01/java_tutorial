package Problem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Problem4 {
    static int getCharCount(String s) {
        s = s.replaceAll(" ", "");
        return s.length();
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(getCharCount("점프 투 자바")));
        bw.write("\n");
        bw.write(String.valueOf(getCharCount("점프 투 자바의 연습문제 풀이")));
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}

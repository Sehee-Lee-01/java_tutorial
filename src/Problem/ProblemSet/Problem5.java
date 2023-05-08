package Problem.ProblemSet;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Problem5 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                bw.write(String.valueOf((i + 1) * (j + 1)));
                bw.write(" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}

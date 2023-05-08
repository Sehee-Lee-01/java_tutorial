package Problem.ProblemSet;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Problem4 {
    static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 10; i++) {
            bw.write(String.valueOf(fib(i)));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}

package Problem.ProblemSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Problem8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        int sum = 0;
        int counter = 0;
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            int num = Integer.parseInt(line.trim());
            sum += num;
            counter++;
        }
        br.close();

        PrintWriter pw = new PrintWriter("result.txt");
        pw.println(sum);
        pw.println(sum / counter);
        pw.close();

    }
}

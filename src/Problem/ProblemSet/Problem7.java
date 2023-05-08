package Problem.ProblemSet;

import java.io.*;
import java.util.*;

public class Problem7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        ArrayList<String> strs = new ArrayList<>();

        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            strs.add(line);
        }
        br.close();

        strs.sort(Comparator.reverseOrder());
        PrintWriter pw = new PrintWriter("result.txt");
        for (String li : strs) {
            pw.println(li);
        }
        pw.close();

    }
}
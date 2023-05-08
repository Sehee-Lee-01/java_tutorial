package Problem.ProblemSet;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = sc.nextLine().split(",");
        int sum = 0;
        for (String num : input) {
            num.trim();
            sum += Integer.parseInt(num);
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        sc.close();
        bw.close();
    }
}

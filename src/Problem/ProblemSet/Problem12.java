package Problem.ProblemSet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Problem12 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        ArrayList<String> resstr = new ArrayList<>();
        resstr.add(line.charAt(0) + "");
        char pre = line.charAt(0);
        int cnt = 1;
        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i) == pre)
                cnt++;
            else {
                resstr.add(cnt + "");
                resstr.add(line.charAt(i) + "");
                pre = line.charAt(i);
                cnt = 1;
            }
        }
        resstr.add(cnt + "");
        br.close();

        String res = String.join("", resstr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(res);
        bw.flush();
        bw.close();
    }
}

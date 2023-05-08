package Problem.ProblemSet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem11 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int[] datas = Arrays.stream(line.split("")).mapToInt(Integer::parseInt).toArray();
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < datas.length - 1; i++) {
            str.add(datas[i] + "");
            if (datas[i] % 2 != 0 && datas[i + 1] % 2 != 0)
                str.add("-");
            else if (datas[i] % 2 == 0 && datas[i + 1] % 2 == 0)
                str.add("*");
        }
        str.add(datas[datas.length - 1] + "");
        String res = String.join("", str);
        System.out.println(res);
    }
}

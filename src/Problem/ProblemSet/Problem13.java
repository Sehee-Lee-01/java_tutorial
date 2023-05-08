package Problem.ProblemSet;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Problem13 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String datas = "0123456789 01234 01234567890 6789012345 012322456789";
        for (String data : datas.split(" ")) {
            boolean res = true;
            int[] isUsed = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            for (int i = 0; i < data.length(); i++) {
                int tmp = data.charAt(i) - '0';
                isUsed[tmp]++;
            }
            for (int val : isUsed) {
                if (val != 1) {
                    res = false;
                    break;
                }
            }
            String resstr = res ? "true" : "false";
            bw.write(resstr);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}

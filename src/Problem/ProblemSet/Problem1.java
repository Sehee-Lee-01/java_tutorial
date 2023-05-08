package Problem.ProblemSet;

// import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        String str = "a:b:c:d";
        String[] strs = str.split(":");
        // ArrayList<String> strs = new ArrayList<>(Arrays.asList(str.split(":")));
        String res = String.join("#", strs);
        System.out.println(res);
    }
}

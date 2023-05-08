package Problem.ProblemSet;

import java.util.ArrayList;

public class Problem15 {
    static String caesar(String word, int n) {
        String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<String> result = new ArrayList<>();
        for (String c : word.split("")) {
            int pos = A.indexOf(c);
            int newPos = pos + n;
            newPos = newPos % A.length();
            result.add(A.charAt(newPos) + "");
        }
        return String.join("", result);
    }

    public static void main(String[] args) {
        System.out.println(caesar("CAT", 5)); // HFY
        System.out.println(caesar("XYZ", 3)); // ABC
    }
}

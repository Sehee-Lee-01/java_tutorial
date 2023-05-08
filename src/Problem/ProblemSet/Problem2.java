package Problem.ProblemSet;

import java.util.HashMap;

public class Problem2 {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("A", 90);
        a.put("B", 80);
        // System.out.println(a.get("C") == null ? 70 : a.get("C"));
        System.out.println(a.getOrDefault("C", 70));
    }
}

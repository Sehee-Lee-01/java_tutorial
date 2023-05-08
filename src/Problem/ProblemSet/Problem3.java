package Problem.ProblemSet;

public class Problem3 {
    public static void main(String[] args) {
        int[] A = { 20, 55, 67, 82, 45, 33, 90, 87, 100, 25 };
        int sum = 0;
        for (int score : A)
            if (score >= 50)
                sum += score;
        System.out.println(sum);
    }
}

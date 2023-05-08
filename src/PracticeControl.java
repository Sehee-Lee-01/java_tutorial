public class PracticeControl {
    public static void main(String[] args) {
        /* Q1 */
        // everywhere

        /* Q2 */
        int i = 0, sum = 0;
        while (i < 1000) {
            i++;
            if (i % 3 != 0)
                continue;
            sum += i;
        }
        System.out.println(sum);

        /* Q3 */
        for (int k = 0; k < 5; k++) {
            for (int j = 0; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        /* Q4 */
        for (int j = 1; j <= 100; j++) {
            System.out.println(j);
        }

        /* Q5 */
        int mean = 0;
        int[] marks = { 70, 60, 55, 75, 95, 90, 80, 80, 85, 100 };
        for (int score : marks) {
            mean += score;
        }
        System.out.println(mean / marks.length);

    }
}

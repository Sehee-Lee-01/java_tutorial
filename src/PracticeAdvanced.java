import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class HeavyWork implements Runnable {
    String name;

    HeavyWork(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        work();
    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n", this.name);
    }
}

@FunctionalInterface
interface CalculateOdd {
    int mul2(int odd_num);
}

public class PracticeAdvanced {
    public static void main(String[] args) throws InterruptedException {
        /* Q1 */
        // import house.HousePark

        /* Q2 */
        // result = 0 +3 +4 = 7;

        /* Q3 */
        long start = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            Thread t = new Thread(new HeavyWork("w" + i));
            threads.add(t); // 스레드를 저장한다.
            t.start();
        }
        for (Thread t : threads) {
            t.join(); // 저장한 스레드가 종료될때까지 대기한다.
        }

        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);

        /* Q4 */
        int[] numbers0 = { 1, 2, 3, 4, 5 };
        int[] result0 = Arrays.stream(numbers0)
                .filter(a -> a % 2 == 1)
                .map(a -> a * 2)
                .toArray();

        /* Q5 */
        int[] numbers1 = { 1, -2, 3, -5, 8, -3 };
        int[] result1 = Arrays.stream(numbers1)
                .filter((a) -> a >= 0)
                .toArray();
    }
}

/**
 * CallByValue
 */
class Updater {
    void update(Counter counter) {
        counter.count++;
    }
}

class Counter {
    int count = 0; // 객체변수
}

public class CallByValue {

    public static void main(String[] args) {
        // 원시 자료형인 경우에는 값만 사용한다.
        Counter myCounter = new Counter();
        System.out.println("before update:" + myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter); // 객체를 전달하면 입력받은 객체를 그대로 사용한다.
        System.out.println("after update:" + myCounter.count);
    }
}
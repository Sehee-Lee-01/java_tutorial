import java.util.ArrayList;
import java.util.Arrays;

interface Mineral {
    int getPrice();
}

class Gold implements Mineral {
    public int getPrice() {
        return 100;
    };

}

class Silver implements Mineral {
    public int getPrice() {
        return 90;
    };
}

class Bronze implements Mineral {
    public int getPrice() {
        return 80;
    };
}

class MineralCalculator {
    int value = 0;

    public void add(Mineral mineral) {
        this.value += mineral.getPrice();
    }

    public int getValue() {
        return this.value;
    }
}

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    boolean isOdd(int val) {
        return val % 2 != 0;
    }

    int avg(int[] vals) {
        int mean = 0;
        for (int element : vals) {
            mean += element;
        }
        return mean / vals.length;
    }

    int avg(ArrayList<Integer> vals) {
        int mean = 0;
        for (int element : vals) {
            mean += element;
        }
        return mean / vals.size();
    }
}

class UpgradeCalculator extends Calculator {
    void minus(int val) {
        this.value -= val;
    }
}

class MaxLimitCalculator extends Calculator {
    // 오버라이딩
    void add(int val) {
        this.value += val;
        if (this.value > 100)
            this.value = 100;
    }
}

public class PracticeOOP {

    public static void main(String[] args) {
        /* Q1 */
        Calculator cal = new Calculator();
        cal.add(10);
        System.out.println(cal.getValue()); // 10 출력

        UpgradeCalculator upCal = new UpgradeCalculator();
        upCal.add(10);
        upCal.minus(3);
        System.out.println(upCal.getValue()); // 10에서 3을 뺀 7을 출력

        /* Q2 */
        MaxLimitCalculator maxLimCal = new MaxLimitCalculator();
        maxLimCal.add(50); // 50 더하기
        maxLimCal.add(60); // 60 더하기
        System.out.println(maxLimCal.getValue()); // 100 출력

        /* Q3 */
        System.out.println(cal.isOdd(3)); // 3은 홀수이므로 true 출력
        System.out.println(cal.isOdd(4)); // 4는 짝수이므로 false 출력

        /* Q4 */
        int[] dataArr = { 1, 3, 5, 7, 9 };
        int result = cal.avg(dataArr);
        System.out.println(result); // 5 출력

        ArrayList<Integer> dataLis = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        result = cal.avg(dataLis);
        System.out.println(result); // 5 출력

        /* Q5 */
        // 4, 객체 전달
        // A: a,b 둘 다 동일한 객체를 가리키고 있다.
        // 독립적으로 생성하려면 아래와 같이 해야한다.
        // ArrayList<Integer> b = new ArrayList<>(a); // (a==b) => false

        /* Q6 */
        // value 초깃값 설정(생성자)
        cal.add(3); // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());

        /* Q7 */
        MineralCalculator MinCal = new MineralCalculator();
        MinCal.add(new Gold());
        MinCal.add(new Silver());
        MinCal.add(new Bronze());
        System.out.println(MinCal.getValue()); // 270 출력

        /* Q8 */
        // 4, 부모 클래스 인스턴스의 자료형을 자식클래스로 지정 할 수 없다?
        // A: Dog 클래스는 Animal의 자식 클래스로 IS-A 관계가 성립될 수 없기 때문이다. 나머지는 모두 IS-A 관계가 성립한다.

        /* Q9 */
        // 2, bark 못사용함, Animal의 기능만 사용 가능
        // A: a 객체가 Animal 타입으로 생성되었기 때문이다. Animal 타입의 객체는 hello 메서드만 사용이 가능하다.
        // 5, hello 못사용함, Predator 기능만 사용 가능
        // A: c 객체가 Predator 타입으로 생성되었기 때문이다. Predator 타입의 객체는 bark 메서드만 사용이 가능하다.
    }
}
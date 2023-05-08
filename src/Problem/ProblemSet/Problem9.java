package Problem.ProblemSet;

import java.util.Arrays;

import javax.xml.crypto.Data;

class Calculator {
    int[] data;

    Calculator(int[] data) {
        this.data = data;
    }

    public int sum() {
        // int s = 0;
        // for (int d : this.data)
        // s += d;
        // return s;
        return Arrays.stream(this.data).sum();
    }

    public float avg() {
        return (float) sum() / this.data.length;

    }
}

public class Problem9 {
    public static void main(String[] args) {
        int[] data1 = { 1, 2, 3, 4, 5 };
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum()); // 15 출력
        System.out.println(cal1.avg()); // 3.0 출력

        int[] data2 = { 6, 7, 8, 9, 10 };
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum()); // 40 출력
        System.out.println(cal2.avg()); // 8.0 출력
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CastandFinal {
    public static void main(String[] args) {
        /* 1. 형변환 */
        /* string -> int */
        String num = "123";
        int n = Integer.parseInt(num);

        /* int -> string */
        // 가장 쉬운 방법은 정수 앞에 빈문자열("")을 더해 주는 것
        String numtost = "" + n;
        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);

        /* string -> double(Float) */
        String numdb = "123.456";
        double d = Double.parseDouble(numdb);

        /* int <-> float(double) */
        int n1 = 123;
        double d1 = n1; // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.

        double d2 = 123.456;
        int n2 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.

        // NumberFormatException: 실수 형태의 문자열을 정수로 변경하려고 하면 발생

        /* 2.final */
        // 프로그램 수행 도중 그 값이 변경되면 안되는 상황에 사용
        // 자바의 final은 자료형에 값을 단 한번만 설정할수 있게 강제하는 키워드이다.
        // 즉, 값을 한번 설정하면 그 값을 다시 설정할 수 없다는 말이다.
        final int n123 = 123; // final 로 설정하면 값을 바꿀수 없다.
        // n = 456; // 컴파일 에러 발생

        // 리스트의 경우도 final로 선언시 재할당은 불가능하다.
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        // a = new ArrayList<>(Arrays.asList("c", "d")); // 컴파일 에러 발생

        /* Unmodifiable List */
        // 리스트의 경우 final로 선언시 리스트에 값을 더하거나(add) 빼는(remove) 것은 가능하다.
        // 다만 재할당만 불가능할 뿐이다.
        // 만약 그 값을 더하거나 빼는 것도 불가능하게 하고 싶은 경우에는
        // List.of로 수정이 불가능한 리스트(Unmodifiable List)를 사용해야 한다.
        final List<String> a123 = List.of("a", "b");
        // a.add("c"); // UnsupportedOperationException 발생
    }
}

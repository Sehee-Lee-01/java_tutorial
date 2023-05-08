public class DataEnum {
    /* 1.Enum 만들기 */
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {
        /* Enum은 서로 관련이 있는 여러 개의 상수 집합을 정의할 때 사용하는 자료형이다. */
        System.out.println(CoffeeType.AMERICANO); // AMERICANO 출력
        for (CoffeeType type : CoffeeType.values()) {
            System.out.println(type); // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력
        }

        /* 2. Enum은 왜 필요한가? */
        // 매직넘버(1과 같은 숫자 상수값)를 사용할 때보다 코드가 명확해 진다.
        // 프로그래밍에서 상수로 선언하지 않은 숫자를 매직넘버라고 한다.
        // 잘못된 값을 사용함으로 인해 발생할수 있는 위험성이 사라진다.

    }
}

public class DataString {
    public static void main(String[] args) {
        /* 원시자료형: 리터럴로만 세팅 가능 */
        boolean bol = true;
        char cha = 'A';
        int inte = 100000;

        /* String: 원시자료형은 아니지만 리터럴 세팅 허용 */
        String e = "java";

        /* method1: equals */
        String d = "hello";// 메모리 공간에 저장 후 찾을 때 리턴
        String f = new String("hello");// 새로운 객체 생성
        System.out.println(d.equals(e)); // false 출력
        System.out.println(d.equals(f)); // true 출력
        System.out.println(d == f); // 주의하자! false 출력(동일한 객체가 아니기 때문에)

        /* method2: indexOf */
        String c = "Hello Java";
        System.out.println(c.indexOf("Java")); // 6 출력, 0부터 센다.

        /* method3: contains */
        String b = "Hello Java";
        System.out.println(b.contains("Java")); // true 출력

        /* method4: charAt */
        String g = "Hello Java";
        System.out.println(g.charAt(6)); // "J" 출력

        /* method5: replaceAll */
        String rep = "Hello Java";
        System.out.println(rep.replaceAll("Java", "World")); // Hello World 출력

        /* method6: substring */
        String sub = "Hello Java";
        System.out.println(sub.substring(0, 4)); // Hell 출력

        /* method7: toUpperCase */
        String tou = "Hello Java";
        System.out.println(tou.toUpperCase()); // HELLO JAVA 출력

        /* method8: split */
        String spl = "a:b:c:d";
        String[] res = spl.split(":"); // result는 {"a", "b", "c", "d"}

        /* method9: format */
        /* 1. 숫자 바로 대입 */
        System.out.println(String.format("I eat %d apples.", 3)); // "I eat 3 apples." 출력

        /* 2. 문자열 바로 대입 */
        System.out.println(String.format("I eat %s apples.", "five")); // "I eat five apples." 출력

        /* 3. 숫자 값을 나타내는 변수로 대입 */
        int number = 3;
        System.out.println(String.format("I eat %d apples.", number)); // "I eat 3 apples." 출력

        /* 4. 2개 이상의 값 넣기 */
        int num = 10;
        String day = "three";
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", num, day));

        /* %s 포맷코드 */
        System.out.println(String.format("I have %s apples", 3)); // "I have 3 apples" 출력
        System.out.println(String.format("rate is %s", 3.234)); // "rate is 3.234" 출력

        /* 포맷 코드와 숫자 함께 사용하기 */
        /* 1. 정렬과 공백 */
        System.out.println(String.format("%10s", "hi")); // "(공백8칸)hi" 출력
        System.out.println(String.format("%-10sjane.", "hi")); // "hi(공백 8칸)jane." 출력

        /* 2. 소수점 표현하기 */
        System.out.println(String.format("%.4f", 3.42134234)); // 3.4213 출력

        /* System.out.printf */
        // System.out.println(String.format("I eat %d apples.", 3)); 과 비슷
        System.out.printf("I eat %d apples.", 3); // "I eat 3 apples." 출력
    }
}

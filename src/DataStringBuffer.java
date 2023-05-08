public interface DataStringBuffer {
    /* StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형 */
    public static void main(String[] args) {
        /* method1:append */
        /*
         * StringBuffer 자료형은 String 자료형보다 무거운 편에 속한다. new StringBuffer() 로 객체를 생성하는 것은
         * 일반 String을 사용하는 것보다 메모리 사용량도 많고 속도도 느리다. 따라서 문자열 추가나 변경 등의 작업이 많을 경우에는
         * StringBuffer를, 문자열 변경 작업이 거의 없는 경우에는 그냥 String을 사용하는 것이 유리하다.
         */

        /* StringBuffer 자료형 사용: StringBuffer 객체는 한번만 생성 */
        /* mutable : StringBuffer는 한번 생성된 값을 언제든지 수정할 수 있다. */
        StringBuffer sb = new StringBuffer(); // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result); // "hello jump to java" 출력

        /* String 자료형 사용: String 자료형에 + 연산이 있을 때마다 새로운 String 객체가 생성 */
        /* immutable: String 자료형은 한 번 값이 생성되면 그 값을 변경할 수가 없다. */
        String res = "";
        res += "hello";
        res += " ";
        res += "jump to java";
        System.out.println(res); // "hello jump to java" 출력

        /* StringBuilder: StringBuffer보다 성능이 우수한 장점 */
        /* StringBuffer는 멀티 스레드 환경에서 안전 */
        /* 동기화를 고려할 필요가 없는 상황에서는 StringBuffer 보다는 StringBuilder를 사용하는 것이 유리 */
        StringBuilder sbu = new StringBuilder();
        sbu.append("hello");
        sbu.append(" ");
        sbu.append("jump to java");
        String res1 = sbu.toString();
        System.out.println(res1);

        /* method2: insert */
        StringBuffer sbu1 = new StringBuffer();
        sbu1.append("jump to java");
        sbu1.insert(0, "hello ");
        System.out.println(sbu1.toString());

        /* method3: substring */
        /* String 자료형의 substring 메서드와 동일하게 동작한다. */
        StringBuffer sbu2 = new StringBuffer();
        sbu2.append("Hello jump to java");
        System.out.println(sbu2.substring(0, 4));

    }
}

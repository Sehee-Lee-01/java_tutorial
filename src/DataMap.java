import java.util.HashMap;

public class DataMap {
    public static void main(String[] args) {
        // 리스트나 배열처럼 순차적으로(sequential) 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다.
        /* HashMap */
        /* 1. put */
        HashMap<String, String> map = new HashMap<>(); // 제네릭스
        map.put("people", "사람");
        map.put("baseball", "야구");

        /* 2. get */
        System.out.println(map.get("people"));

        /* getOrDefault */
        System.out.println(map.get("java")); // null 출력
        System.out.println(map.getOrDefault("java", "자바")); // "자바" 출력

        /* 3. containsKey */
        System.out.println(map.containsKey("people")); // true 출력

        /* 4. remove */
        System.out.println(map.remove("people")); // "사람" 출력

        /* 5. size */
        System.out.println(map.size());

        /* 6.keySet */
        System.out.println(map.keySet()); // [baseball, people] 출력

        /* LinkedHashMap과 TreeMap */
        /* LinkedHashMap: 입력된 순서대로 데이터를 저장 */
        /* TreeMap: 입력된 key의 오름차순 순서로 데이터를 저장 */
    }
}

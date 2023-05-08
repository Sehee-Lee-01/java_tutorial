import java.util.ArrayList; //ArrayList 사용하기 위해서 추가
import java.util.Arrays; // asList 메서드를 사용하면 이미 존재하는 문자열 배열로 ArrayList를 생성
import java.util.Comparator; // 정렬기준

public class DataList {
    public static void main(String[] args) {
        /* 리스트와 배열의 가장 큰 차이: 배열은 크기가 정해져 있다.리스트는 크기가 동적으로 변한다. */
        /* ArrayList: List 자료형 중 가장 간단한 형태의 자료형 */
        /* method1: add */
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "133"); // 첫번째 위치에 133 삽입.

        /* method2: get */
        System.out.println(pitches.get(1));

        /* method3: size */
        System.out.println(pitches.size());

        /* method4: contains */
        System.out.println(pitches.contains("142"));

        /* method5: remove */
        System.out.println(pitches.remove("129"));// 객체 return true
        System.out.println(pitches.remove(0));// 인덱스 return 삭제된 항목

        /* 제네릭스(Generics) */
        // ArrayList<String> pitches1 = new ArrayList<String>();
        ArrayList<String> pitches1 = new ArrayList<>(); // 선호되는 방식
        pitches1.add("138");
        pitches1.add("129");
        pitches1.add("142");

        /* 제네릭스를 사용하지 않은 경우 */
        String one = (String) pitches.get(0); // Object 자료형을 String 자료형으로 캐스팅한다.

        /* 제네릭스를 사용한 경우 */
        String one1 = pitches1.get(0); // 형 변환이 필요없다.

        /* 다양한 방법으로 ArrayList 만들기 */
        System.out.println(pitches1); // [138, 129, 142] 출력

        /* 이미 문자열 배열이 존재할 경우에는 보다 편하게 ArrayList를 생성 */
        String[] data = { "138", "129", "142" }; // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList(data));
        // ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129",
        // "142"));
        System.out.println(pitches2); // [138, 129, 142] 출력

        /* String.join */
        /* ArrayList의 각 요소를 콤마(",")로 구분하여 다음과 같은 하나의 문자열로 생성 */
        /* 방법1:pitches를 갯수만큼 루프를 돌면서 뒤에 콤마를 더하고 최종적으로 마지막 콤마를 제거하는 방법 */
        /* 방법2: String.join */
        String result = String.join(",", pitches2);
        System.out.println(result); // 138,129,142 출력

        /* 문자배열에도 사용 가능하다. */
        String[] pitches3 = new String[] { "138", "129", "142" };
        String result1 = String.join(",", pitches3);
        System.out.println(result1); // 138,129,142 출력

        /* 리스트 정렬하기 */
        /* 오름차순(순방향) 정렬 - Comparator.naturalOrder() */
        /* 내림차순(역방향) 정렬 - Comparator.reverseOrder() */
        pitches2.sort(Comparator.naturalOrder()); // 오름차순으로 정렬
        System.out.println(pitches); // [129, 138, 142] 출력

    }
}

import java.util.Arrays;
import java.util.HashSet;

public class DataSet {
    public static void main(String[] args) {
        /* 집합 자료형은 어떻게 만들까? */
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o")); // l중복
        System.out.println(set); // [e, H, l, o] 출력

        /* 집합 자료형의 특징 */
        // 중복을 허용하지 않는다.
        // 순서가 없다(Unordered).

        /* 교집합, 합집합, 차집합 구하기 */
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        /* 1. 교집합 */
        HashSet<Integer> intersection = new HashSet<>(s1); // s1으로 intersection 생성
        intersection.retainAll(s2); // 교집합 수행
        System.out.println(intersection); // [4, 5, 6] 출력

        /* 2. 합집합 */
        HashSet<Integer> union = new HashSet<>(s1); // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union); // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력

        /* 3. 차집합 */
        HashSet<Integer> substract = new HashSet<>(s1); // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract); // [1, 2, 3] 출력

        /* 집합 자료형 관련 메서드 */
        /* 1.값 추가하기(add) */
        set.add("Jump");
        set.add("To");
        set.add("Java");

        /* 2.값 여러 개 추가하기(addAll) */
        // 합집합을 구할 때도 addAll을 사용했다.
        set.addAll(Arrays.asList("To", "Java"));

        /* 3. 특정 값 제거하기(remove) */
        set.remove("To");

        /* TreeSet과 LinkedHashSet */
        // LinkedHashSet: 입력한 순서대로 값을 정렬하여 저장하는 특징이 있다.
        // TreeSet: 오름차순으로 값을 정렬하여 저장하는 특징이 있다.
    }
}

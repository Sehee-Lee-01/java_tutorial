import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator; // 정렬기준
import java.util.HashMap;
import java.util.HashSet;

public class PracticeData {
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }

    static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000); // 1: 아메리카노
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000); // 2: 아이스 아메리카노
        priceMap.put(CoffeeType.CAFE_LATTE, 5000); // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args) {
        /* Q1 */
        int korean = 80;
        int english = 75;
        int math = 55;
        int mean = (korean + english + math) / 3;
        System.out.println(mean);

        /* Q2 */
        Boolean is13odd = 13 % 2 == 0 ? false : true;
        System.out.println(is13odd);

        /* Q3 */
        String personnum = "881120-1068234";
        System.out.println(personnum.substring(0, 6));
        System.out.println(personnum.substring(7));

        /* Q4 */
        System.out.println(personnum.charAt(7));

        /* Q5 */
        String a = "a:b:c:d";
        System.out.println(a.replaceAll(":", "#"));

        /* Q6 */
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder()); // 오름차순으로 정렬
        System.out.println(myList);

        /* Q7 */
        ArrayList<String> myList1 = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList1);
        System.out.println(result);

        /* Q8 */
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        System.out.println(grade.remove("B"));

        /* Q9 */
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> numset = new HashSet<>(numbers);
        System.out.println(numset);

        /* Q10 */
        printCoffeePrice(CoffeeType.AMERICANO);
        printCoffeePrice(CoffeeType.CAFE_LATTE);
        printCoffeePrice(CoffeeType.ICE_AMERICANO);
    }
}
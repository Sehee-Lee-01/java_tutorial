public class DataArray {
    public static void main(String[] args) {
        /* 배열이란 자료형의 종류가 아닌 자료형의 집합을 의미 */
        int[] odds = { 1, 3, 5, 7, 9 }; // int 배열
        String[] weeks = { "월", "화", "수", "목", "금", "토", "일" }; // String 배열

        /* 배열의 길이는 고정되어 있다 */
        String[] weeks1 = new String[7];
        weeks1[0] = "월";
        weeks1[1] = "화";
        weeks1[2] = "수";
        weeks1[3] = "목";
        weeks1[4] = "금";
        weeks1[5] = "토";
        weeks1[6] = "일";

        /* 배열의 값은 어떻게 접근할 수 있을까? */
        System.out.println(weeks[3]);

        /* 배열의 길이 */
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }

        /* 빈번한 배열의 오류: ArrayIndexOutOfBoundsException */
        // 아래 8번째 배열값이 없으므로 ArrayIndexOutOfBoundsException 오류가 발생한다.
        // System.out.println(weeks[7]);

    }
}

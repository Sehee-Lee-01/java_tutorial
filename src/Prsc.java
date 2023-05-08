import java.util.*;

public class Prsc {
    public static void main(String[] args) {
        String s = "{{4,2,3},{10000000},{2,3,4,1},{2,3}}";
        s = s.replace("{{", "");
        s = s.replace("}}", "");
        String[] sets = s.split("\\}\\,\\{");

        Arrays.sort(sets, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String[] as = a.split("\\,");
                String[] bs = b.split("\\,");
                if (as.length > bs.length)
                    return 1;
                return -1;
            }
        });
        for (String set : sets) {

            System.out.println(set);
        }
    }
}

package CodingTest.Practice;

import java.io.*;
import java.util.*;

public class Functions {
    public static void main(String[] args) {
        /* Map */
        HashMap<String, String> hm = new HashMap<>();
        hm.put("key", "value");
        hm.get("key"); // = "value"
        hm.containsKey("key"); // = true
        hm.getOrDefault("noKey", "default"); // = "default"
        Set<String> keySet = hm.keySet(); // key set

        /* ArrayList */
        ArrayList<String> al = new ArrayList<>();
        al.add("value");
        al.add(0, "first value");
        al.set(1, "second value"); // "value" -> "second value"
        al.remove(0); // index == 0, remove "first value"
        Iterator<String> it = al.iterator(); // list iterator
        it.hasNext(); // index ++
        // it.hasPrevious(); // index --
        al.indexOf("second value"); // return 0, if not has value return -1;
        al.get(0).intValue();

    }
}
// 참고 블로그: https://velog.io/@ryusuz/JAVA-코딩테스트용-주요-함수-모음
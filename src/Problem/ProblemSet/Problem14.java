package Problem.ProblemSet;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem14 {
    public static void main(String[] args) {
        String datas = ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";
        HashMap<String, String> mose = new HashMap<>() {
            {
                put(".-", "A");
                put("-...", "B");
                put("-.-.", "C");
                put("-..", "D");
                put(".", "E");
                put("..-.", "F");
                put("--.", "G");
                put("....", "H");
                put("..", "I");
                put(".---", "J");
                put("-.-", "K");
                put(".-..", "L");
                put("--", "M");
                put("-.", "N");
                put("---", "O");
                put(".--.", "P");
                put("--.-", "Q");
                put(".-.", "R");
                put("...", "S");
                put("-", "T");
                put("..-", "U");
                put("...-", "V");
                put(".--", "W");
                put("-..-", "X");
                put("-.--", "Y");
                put("--..", "Z");
            }
        };
        ArrayList<String> decodes = new ArrayList<>();
        for (String word : datas.split("  ")) {
            for (String code : word.split(" ")) {
                decodes.add(mose.get(code));
            }
            decodes.add(" ");

        }

        System.out.println(String.join("", decodes));
    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L290 {
    public static void main(String[] args) {
        String pattern = "deadbeef";
        String s="d e a d b e e f";
        boolean a =wordPattern(pattern,s);
        System.out.println(a);
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.toCharArray()[i];
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(words[i])) return false;
            } else {
                if (map.containsValue(words[i])) return false;
                map.put(ch, words[i]);
            }
        }

        return true;
    }
}

import java.util.Stack;

public class Bai4 {
    public static void main(String[] args) {
        boolean a=backspaceCompare( "ab##","c#d#");
        System.out.println(a);
    }
        public static boolean backspaceCompare(String S, String T) {
            return build(S).equals(build(T));
        }

        public static String build(String S) {
            Stack<Character> ans = new Stack();
            for (char c: S.toCharArray()) {
                if (c != '#')
                    ans.push(c);
                else if (!ans.empty())
                    ans.pop();
            }
            return String.valueOf(ans);
        }
}

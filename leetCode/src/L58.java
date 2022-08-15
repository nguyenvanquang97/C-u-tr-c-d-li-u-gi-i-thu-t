public class L58 {
    public int lengthOfLastWord(String s) {
       String[] clone= s.split(" ");
       int index = clone[clone.length-1].length();
       return index;
    }
}

public class L28 {
    public int strStr(String haystack, String needle) {
        int index =0;
        if (needle==null){
            index=0;
        }else {
            index = haystack.indexOf(needle);
        }
        return index;
    }
}

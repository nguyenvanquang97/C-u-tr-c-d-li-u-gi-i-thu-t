public class Longest_Common_Prefix {
    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};
       String rs=longestCommonPrefix(strs);
        System.out.println(rs);
    }
    public  static String longestCommonPrefix(String[] strs) {
        String result ="";
        String s =strs[0];
        int count=0;

            for (int j=0;j<s.length();j++){
                for (int i=1;i<strs.length;i++){
                if(strs[i].indexOf(s.charAt(j))>0){
                       if(strs[i].indexOf(s.charAt(j))!=strs[i-1].indexOf(s.charAt(j))){

                           count++;

                   }
                }
            }
                if (count==0){
                    result+=s.charAt(j);
                }
                count=0;
        }

        return result;
    }
}

import java.util.Arrays;

public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
       String[] word1 = {"a", "cb"};
       String[] word2 = {"ab", "c"};

    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2 =new StringBuilder();

        for (String s:word1){
            str1.append(s)
         ;
        }
        for (String s:word2){
            str2.append(s);
        }


        if (str1.toString().equals(str2.toString())){
            return true;
        }else {
            return false;
        }
    }
}

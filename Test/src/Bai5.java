import java.util.ArrayList;
import java.util.List;

public class Bai5 {
    public static void main(String[] args) {
        String  s = "3[a2[c]]";
        String a=decodeString(s);
        System.out.println(a);

    }

private static int findRight(int index, String str){

    int balance = 0 ;
    for(int i = index ; i < str.length();i++){

        if(str.charAt(i)=='['){
            balance++;
        }else if(str.charAt(i)==']'){
            balance--;
        }

        if(balance==0){
            return i;
        }
    }

    return -1;

}
    public static String decodeString(String s) {

        StringBuilder ans = new StringBuilder();
        int len = 0;
        int index=0;
        int num = 0;
        String appendStr="";
        for(int i  = 0 ;i < s.length() ; i++){

            if(Character.isDigit(s.charAt(i)))
            {
                num = num*10 + s.charAt(i)-'0';
            }else if(s.charAt(i)=='['){


                int findRgt = findRight(i,s);
                appendStr= decodeString(s.substring(i+1,findRgt));
                while(num>0){
                    ans.append(appendStr);
                    num--;
                }
                i= findRgt;
            }else if(Character.isLetter(s.charAt(i))){
                ans.append(s.charAt(i));
            }
            System.out.println("inter - "+ ans+" "+i);

        }

        System.out.println("final - "+ ans);
        return ans.toString();
    }
}

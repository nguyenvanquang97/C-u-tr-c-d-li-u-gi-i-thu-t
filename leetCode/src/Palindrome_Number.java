public class Palindrome_Number {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        Boolean result =null;
        StringBuilder str =new StringBuilder(Integer.toString(x));
        if (str.toString().equals(str.reverse().toString())){
            result= true;
        }else {
            result =false;
        }
       return result;
    }
}

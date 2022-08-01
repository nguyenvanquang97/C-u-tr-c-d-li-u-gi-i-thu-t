import java.util.Arrays;

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
       int[] nums = {12,345,2,6,7896};
    }
    public int findNumbers(int[] nums) {
        int count =0;
        for (int i=0;i<nums.length;i++){
           int length= Integer.toString(nums[i]).length();
           if(length %2==0){
               count ++;
           }
        }
        return count;
    }
}

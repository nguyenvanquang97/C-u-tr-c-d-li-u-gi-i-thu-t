public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for (int i=j;j<nums.length;j++){
            nums[j]=0;
        }
    }
}

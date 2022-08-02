public class Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {
        int j=0;
        int[] clone =new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2==0){
                clone[j]=nums[i];
                j++;
            }
        }
        for (int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                clone[j]=nums[i];
                j++;
            }
        }
        return clone;
    }
}

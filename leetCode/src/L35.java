public class L35 {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target =7;
        int index =searchInsert(nums,target);
        System.out.println(index);

    }
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        int count=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]==target){
                index=i;
                count++;

            }
        }

        if (count == 0 ) {
            for (int i = nums.length-1; i>=0; i--) {
                if (nums[i]<target){
                    index=i+1;
                    break;
                }
            }

        }
        return index;
    }
}

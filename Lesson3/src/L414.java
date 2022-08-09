public class L414 {
    public int thirdMax(int[] nums) {
        int max = 0;
        if (nums.length < 3) {
            if(nums.length==1){
                max=nums[0];
            }
            else if (nums[0] < nums[1]) {
                max = nums[1];
            } else {
                max = nums[0];
            }
        } else {
            int count=0;
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
            for (int i=n-1;i>0;i--){
                if (nums[i]>nums[i-1]){
                    count++;
                    if (count==2){
                        max=nums[i-1];
                        break;
                    }
                }
            }
            if (count<2){
                max=nums[n-1];
            }
        }
        return max;
    }
}

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 1, 2, 2, 3, 3, 4};
        int n = removeDuplicates(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static int removeDuplicates(int[] nums) {
        int low = 0;
        int high = 1;
        int count = 0;

        while(high < nums.length) {
            if(nums[low] != nums[high]) {
                low++;
                nums[low] = nums[high];
                high++;
                count++;
            } else {
                high++;
            }
        }
        return count + 1;
    }

}

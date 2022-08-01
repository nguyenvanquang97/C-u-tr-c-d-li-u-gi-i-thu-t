import java.util.Arrays;

public class Remove_Element {
    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};;
        int count =removeElement(nums, 2);
        System.out.println(count);
        for (int i=0;i<count;i++){
            System.out.print(nums[i]+" ");
        }
    }
        public static int removeElement(int[] nums, int val) {
            if (nums.length == 0) {
                return 0;
            }
            int i = 0;
            for (int j = 0; j <nums.length; j++) {
                if (nums [j]!= val) {
                    nums [i] = nums [j];
                    i ++;
                }

            }
            return i;
        }
    }

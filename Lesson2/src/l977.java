import java.util.Arrays;

public class l977 {
    public int[] sortedSquares(int[] nums) {
        int[] clone =new int[nums.length];
        for (int i=0;i<nums.length;i++){
            clone[i]=nums[i]*nums[i];
        }
        Arrays.sort(clone);
        return clone;
    }
}

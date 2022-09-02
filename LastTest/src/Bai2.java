import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Bai2 {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]) list.add(nums[i]);
        }
        return list;
    }
}

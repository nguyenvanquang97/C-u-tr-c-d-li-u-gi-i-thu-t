public class Main {
    public int search(int[] nums, int target) {
        int iLeft=0;
        int iRight= nums.length-1;
        int iMid=0;
       while (iLeft<=iRight){
           iMid=(iLeft+iRight)/2;
           if (nums[iMid]==target){
               return iMid;
           }
           else if (target<nums[iMid]){
               iRight=iMid-1;
           }else {
               iLeft=iMid+1;
           }
       }
       return -1;
    }
    public static int search2(int[]nums,int target,int iLeft,int iRight){
        if (iLeft>iRight){
            return -1;
        }
        int iMid=(iLeft+iRight)/2;
        if (target==nums[iMid]){
            return iMid;
        }else if (target<nums[iMid]){
            return search2(nums,target,iLeft,iMid-1);
        }else {
            return search2(nums,target,iMid+1,iRight);
        }
    }
}

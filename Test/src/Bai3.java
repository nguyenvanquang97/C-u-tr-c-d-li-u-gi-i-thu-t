public class Bai3 {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        int a =pivotIndex(nums);
        System.out.println(a);
    }
    public static int pivotIndex(int[] nums) {
        int sumL=0;

        for (int i=0;i< nums.length;i++){
            int sumR=0;
            if (i == 0){
                sumL=0;
            }
            else {
                sumL += nums[i-1];
            }
            for (int j=i+1;j< nums.length;j++){
                sumR+= nums[j];
            }
            if (sumL==sumR){
                return i;
            }
        }
        return -1;
    }
}

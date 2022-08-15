public class MergeSort {
    public int[] sort(int[] nums, int iL, int iR) {
        if (iL == iR) {
            int[] singleElement = {nums[iL]};
            return singleElement;
        }
        int iM = (iL + iR) / 2;
        int[] nums1 = sort(nums, iL, iM);
        int[] nums2 = sort(nums, iM + 1, iR);
        // gộp mảng
        return null;
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] result = new int[n];
        int i = 0;//chạy trên mảng kết quả
        int i1 = 0; //chạy trêm mảng nums1
        int i2 = 0;//chạy trên mảng nums2

        while (i < n) {
            // cả 2 mảng không rỗng
            if (i1 < nums1.length && i2 < nums2.length) {
                if (nums1[i1] < nums2[i2]) {
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = nums2[i2];
                    i2++;
                    i++
                }
            } else {//1 trong 2 mảng rỗng
                if ((i1 < nums1.length)) {
                    result[i] = nums1[i1];
                    i1++;
                    i++
                } else {
                    result[i] = nums2[i2];
                    i2++;
                    i++;
                }
            }
            return result;
        }
    }
}

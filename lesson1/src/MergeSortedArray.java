import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =m-1;
        int j=n-1;
        int k =m+n-1;

        while (k>=0){
            if (j<0){//mảng 2 không có phần tử nào
                nums1[k]=nums1[i];
                i--;
                k--;
            }else if(i<0){
                nums1[k]=nums2[j];
                j--;
                k--;
            } else if (nums1[i]>nums2[j]) {
                nums1[k]=nums1[i];
                i--;
                k--;
            }else {
                nums1[k] =nums2[j];
                j--;
                k--;
            }
        }
    }
}

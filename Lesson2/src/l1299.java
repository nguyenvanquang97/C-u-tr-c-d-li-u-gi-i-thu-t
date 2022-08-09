public class l1299 {
    public static void main(String[] args) {
        int[] arr={17,18,5,4,6,1};
       l1299 l1299=new l1299();
       int[]clone =l1299.replaceElements(arr);
       for (int i:clone){
           System.out.print(i+" ");
       }

    }
    public int[] replaceElements(int[] arr) {
        int max=0;
        int[] clone =new int[arr.length];
        for (int j=0;j<arr.length;j++) {
            if (j == arr.length - 1) {
                clone[j] = -1;
            } else {
                for (int i = j + 1; i < arr.length; i++) {
                    if (max < arr[i]) {
                        max = arr[i];
                    }
                }
                clone[j] = max;
                max=0;
            }
        }
     return clone;
    }
}

public class l1089 {
    public void duplicateZeros(int[] arr) {
        int length =arr.length;
        int[] newArr= new int[length];

        for (int i=0, j=0;i<length&&j<length;i++,j++){
            if (arr[i]!=0){
                newArr[j]=arr[i];
                ;
            }else {
                newArr[j]=0;
                j++;
                if (j>=length){
                    break;
                }else {
                    newArr[j] = 0;
                }
            }
        }
        for (int i=0;i<length;i++){
            arr[i]=newArr[i];
        }
    }
}

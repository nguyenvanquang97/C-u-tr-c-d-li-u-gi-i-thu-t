import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr [] ={3,7,2,1,9};
        // thêm vào đầu danh sách
       int [] result = insertFirst(arr,5);
       for (int i=0;i<result.length;i++){
           System.out.println(result[i]);
       }
       int[] newResult = insert(arr,5,2);
       show(newResult);

    }
    public static int[] insertFirst(int[] arr,int x){
        int n =arr.length +1;
        int [] result = new int[n];
        for (int i=0;i<arr.length;i++){
          result[i+1]=arr[i] ;
        }
        result[0]=x;
        return result;
    }
    public static void show(int[] arr){
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
    // thêm vào vị trí bất kì
    public  static  int[] insert(int[] arr,int x,int position){
        int n=arr.length+1;
      int[] result =new int[n];
       if ((position>=0 && position<=(n-1))){
           result = Arrays.copyOf(arr,n);
           for (int i=0;i<n;i++){
               int j=i-1;
               if (i>position){
                   result[i]=result[i];
               }
           }
           result[position]=x;
       }
        return result;
    }
}

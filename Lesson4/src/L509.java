public class L509 {
    public int fib(int n) {
        int[] fib=new int[n];
        if (n==0){
            return 0;
        }if (n==1) {
            return 1;
        }
        if (n==2){
            return 1;
        }
        else {
            fib[0]=0;
            fib[1]=1;
        for (int i=2;i<=n;i++){

                fib[i]=fib[i-1]+fib[i-2];

            }
        }
        return fib[n];
    }
}

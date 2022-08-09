public class Main {
    public static void main(String[] args) {
//        int a=1;
//        for (int i=1;i<=5;i--){
//            a=a*i;
//        }
//        System.out.println(a);
    }
    public void method(){
        System.out.println("hello");
        method();
    }
public static int factorialUsingRecusion(int n){
        if (n==0){
            return 1;
        }
        //công thức đệ quy
    return n*factorialUsingRecusion(n-1);
}
}

public class Main {
    public static void main(String[] args) {
        String s="algoithm";
        char [] arr=s.toCharArray();
        for (char c:arr){
            System.out.println(c);
        }

        System.out.println(Character.isDigit('4'));
        for (char c:arr){
            System.out.println(c+" có mã ASCII là: "+(int)c);
        };
    }
}

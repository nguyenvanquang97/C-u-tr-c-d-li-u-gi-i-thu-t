public class Main {
    public static int[] romanToIntArr(String s){
        int[] arr=new int[s.length()];
        for (int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'I':
                    arr[i]=1;
                    break;
                case 'V':
                    arr[i]=5;
                    break;
                case 'X':
                    arr[i]=10;
                    break;
                case 'L':
                    arr[i]=50;
                    break;
                case 'C':
                    arr[i]=100;
                    break;
                case 'D':
                    arr[i]=500;
                    break;
                case 'M':
                    arr[i]=1000;
                    break;
            }
        }
        return arr;
    }
    public static int romanToInt(String s) {
        int[] arr=romanToIntArr(s);

        int sum=0;
        for (int i=arr.length-1;i>=0;i--){
            int j=i-1;
            if (j<0){
                sum+=arr[i];
                break;
            }
            if (arr[i]>arr[j]){
                sum+=arr[i]-arr[j];
                i--;

            } else  {
                sum+=arr[i];

            }
        }
return sum;
    }
}

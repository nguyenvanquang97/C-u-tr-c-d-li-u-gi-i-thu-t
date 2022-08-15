public class L821 {
    public static void main(String[] args) {
        String s="rzazolgxogbmcjjievdt";
        char c='g';
        int[] answer=shortestToChar(s,c);
        for (int i:answer){
            System.out.print(i+" ");
        }
    }
    public static int[] shortestToChar(String s, char c) {
        int[] answer=new int[s.length()];
        int m=s.indexOf(c);
        for (int i=0;i<m;i++){
            answer[i]=m-i;
        }
        int count=m+1;
        for (int i=m+1;i<s.length();i++){
            if (s.charAt(i)==c){
                answer[i]=0;
                for (int j=count;j<i;j++){
                    if (j-m>=i-j){
                        answer[j]=i-j;
                    }else {
                        answer[j]=j-m;
                    }

                }
                m=i;

                count=i+1;
            }else {
                answer[i]=i-m;
            }
        }
        return answer;
    }
}


import java.util.HashSet;
import java.util.Set;

public class Bai3 {
    public static void main(String[] args) {
        String[] emails={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int rs=numUniqueEmails(emails);
        System.out.println(rs);
    }
    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < emails.length; ++i) {
            String[] email = emails[i].split("@");
            String preEmail = email[0];
            String postEmail = email[1];

            String[] preEmailSplit = preEmail.split("\\+");
            String resultPreEmail = preEmailSplit[0].replace(".", "");

            set.add(resultPreEmail + "@" +postEmail);
        }

        return set.size();
    }
}

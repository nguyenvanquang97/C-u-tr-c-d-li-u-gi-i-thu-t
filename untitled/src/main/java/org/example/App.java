package org.example;

import org.mindrot.jbcrypt.BCrypt;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        UserService service =new UserService();
        ArrayList<User> list = service.getAllUser();
        list.forEach(i-> System.out.println(i));

        service.insert();

        String passWord ="123456789";
        String encode = BCrypt.hashpw(passWord,BCrypt.gensalt(12));
        System.out.println(encode);

        System.out.println(BCrypt.checkpw("1234567890",encode));

    }

}

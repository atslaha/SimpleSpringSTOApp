/**
 * 
 */
package il.co.ssstoapp.classes;

import org.springframework.util.SystemPropertyUtils;

import il.co.ssstoapp.interfaces.User;

/**
 * @author artem
 *
 */
public class UserJack implements User {
    
    public UserJack() {}

    @Override
    public void goToServiceStation() {
        System.out.println("I'm going to service station!");

    }

    @Override
    public void payTheBill() {
        System.out.println("I've paid the bill!");

    }

}

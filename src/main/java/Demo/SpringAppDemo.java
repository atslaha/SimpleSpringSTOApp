package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import il.co.ssstoapp.classes.UserJack;

public class SpringAppDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        
        Object obj = context.getBean("userJack");
        if (obj instanceof UserJack){
            UserJack jack = (UserJack) obj;
            jack.goToServiceStation();
        }

    }

}

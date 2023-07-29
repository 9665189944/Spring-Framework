package Mobile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Mobile m1=c1.getBean("mobile1",Mobile.class);
        m1.getType();
        m1.getBattery();
        System.out.println("====================================================================");
        Mobile m2=c1.getBean("mobile2",Mobile.class);
        m2.getType();
        m2.getBattery();
    }
}

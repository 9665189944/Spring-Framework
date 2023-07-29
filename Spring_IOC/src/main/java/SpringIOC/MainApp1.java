package SpringIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Master m=c1.getBean(Master.class,"m1");
        m.display();
    }
}

package SpringIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Machine m1=c1.getBean("machine1",Machine.class);
        m1.getMachineType();
        m1.getMachineName();
        System.out.println("================================================================");
        Machine m2=c1.getBean("machine2",Machine.class);
        m2.getMachineType();
        m2.getMachineName();
    }
}

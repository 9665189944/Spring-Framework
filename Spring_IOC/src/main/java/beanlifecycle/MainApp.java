package beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.image.SampleModel;

public class MainApp {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("applicationContext.xml");

        Demo ref1 = c1.getBean("d1", Demo.class);
        ref1.test();
        Demo ref2 = c1.getBean("d1", Demo.class);
        ref2.test();

        System.out.println(ref1==ref2);
     //Scope Prototype
        sample ref3=c1.getBean("s1",sample.class);
        sample ref4= c1.getBean("s1",sample.class);
        ref3.sim();
        System.out.println(ref3==ref4);
    }
}

package iocannotation;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Course s1 = c1.getBean("course1", Course.class);
            s1.getCourseName();
              s1.getCourseSyllabus();
        Course s2 = c1.getBean("course2", Course.class);
        s2.getCourseName();
        s2.getCourseSyllabus();
    }

}

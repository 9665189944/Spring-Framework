package iocannotation;

import org.springframework.stereotype.Component;

@Component("course1")
public class Development implements Course{


    @Override
    public void getCourseName() {
        System.out.println("Software development");
    }

    @Override
    public void getCourseSyllabus() {
        System.out.println("Java j2ee SQL");
    }
}

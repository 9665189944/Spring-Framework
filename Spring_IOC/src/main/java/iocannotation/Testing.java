package iocannotation;

import org.springframework.stereotype.Component;

@Component("course2")
public class Testing implements Course{


    @Override
    public void getCourseName() {
        System.out.println("Testing  ");
    }

    @Override
    public void getCourseSyllabus() {
        System.out.println("Manual ,Automation");
    }
}

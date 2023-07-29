package beanlifecycle;

import org.springframework.stereotype.Component;

@Component("d1")
public class Demo {
    void test()
    {
        System.out.println("Test Method");
    }
}

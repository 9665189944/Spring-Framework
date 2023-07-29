package beanlifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s1")
@Scope("prototype")
public class sample {


    public void sim()
    {
        System.out.println("sim method");
    }
}

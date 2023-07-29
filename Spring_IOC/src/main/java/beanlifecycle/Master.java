package beanlifecycle;

public class Master {
    //@PostConstruct -->up to Spring 5
    void startup()
    {
        System.out.println();
    }

    void info()
    {
        System.out.println();
    }
    //@PreDestroy --> up to Spring5
    void  cleanup()
    {
        System.out.println("destroy Method");
    }
}

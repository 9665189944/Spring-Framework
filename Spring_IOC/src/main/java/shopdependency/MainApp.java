package shopdependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select shop");
        System.out.println("1:Electronic shop\n2:GroceryShop");
        int choice= sc.nextInt();
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");

        shop s1=null;
        if (choice==1)
        {
            s1=c1.getBean("shop2", shop.class);

        } else if (choice==2) {
            s1=c1.getBean("shop1",shop.class);
        }

        if (s1 != null) {

            s1.getshopType();
            s1.getProduct();
        }

    }
}

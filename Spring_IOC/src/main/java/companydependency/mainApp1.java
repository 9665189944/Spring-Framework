package companydependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class mainApp1
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Select the Company type");
        System.out.println("1.ServiceBAsed");
        System.out.println("2.ProductBased");
        int ch= sc.nextInt();

        Company company=null;


        if (ch==1){
            company=c1.getBean("company1",Company.class);

        } else if (ch==2) {
            company=c1.getBean("company2",Company.class);

        }

        if (company!=null)
        {
            company.getCompanyType();
            company.getEmployees();
            company.getProjects();
        }
    }
}

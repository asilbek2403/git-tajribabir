package asilcore.uz;

import asilcore.uz.Automat.Benlary;
import asilcore.uz.Automat.Examf1;
import asilcore.uz.Baninject.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        Benlary benlary = (Benlary) context.getBean("benlary");
        System.out.println(benlary);


        //        Examf1 examf1 = (Examf1) context.getBean("examf1");
//        System.out.println(examf1);

        //        Autotype autotype2 = (Autotype) context.getBean("autotype1");
//        System.out.println(autotype2);


        //        Tak tak = (Tak) context.getBean("tak1");
//        System.out.println(tak);


        //        Objfruit objfruit = (Objfruit) context.getBean("objfruit");
//        System.out.println(objfruit);


        //        Banana banan= (Banana) context.getBean("banana1");
//        System.out.println(banan);//Constructor inject


        //        Limona limon1= (Limona) context.getBean("limona");//Setter Inject
//        System.out.println(limon1);
//        context.registerShutdownHook();// destroy holatini consolga ko'rsatadi




    }




}
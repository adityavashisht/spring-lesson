package org.indasil.learningjava.spring.intro.simple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vashishta on 9/18/15.
 */
public class BeanWiring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"/manager.xml"});

        Manager manager = (Manager) context.getBean("manager");

        manager.delegateTask();
    }
}

package org.indasil.learningjava.spring.intro.software;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vashishta on 9/18/15.
 */
public class BeanWiring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"/coder.xml"});

        Development development = (Development) context.getBean("development");

        development.start();
    }
}

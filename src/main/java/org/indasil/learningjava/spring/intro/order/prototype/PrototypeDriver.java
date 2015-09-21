package org.indasil.learningjava.spring.intro.order.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vashishta on 9/21/15.
 */
public class PrototypeDriver {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/order/order-prototype.xml"});

        Order order = context.getBean("order", Order.class);


        order.setState();

        System.out.println(order);

    }
}

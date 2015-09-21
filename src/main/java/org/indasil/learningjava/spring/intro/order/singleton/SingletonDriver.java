package org.indasil.learningjava.spring.intro.order.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vashishta on 9/21/15.
 */
public class SingletonDriver {

    public static void main(String [] args) {
        Order order = new Order();

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/order/order-singleton.xml"});

        OrderService orderService = context.getBean("orderService", OrderService.class);
        PackageService packageService = context.getBean("packageService", PackageService.class);

        order.setId(orderService.addOrder());
        order.setShip(packageService.getShipping());

        System.out.println(order);


    }
}

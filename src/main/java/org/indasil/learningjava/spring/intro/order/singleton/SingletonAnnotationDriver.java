package org.indasil.learningjava.spring.intro.order.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by vashishta on 9/21/15.
 */
public class SingletonAnnotationDriver {

    public static void main(String[] args) {
        ApplicationContext ctx = new
                AnnotationConfigApplicationContext(SingletonConfig.class);

        OrderService orderService = ctx.getBean("orderService", OrderService.class);

        System.out.println(orderService.addOrder());

    }
}

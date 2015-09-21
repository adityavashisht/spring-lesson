package org.indasil.learningjava.spring.intro.order.singleton;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by vashishta on 9/21/15.
 */
@Component("orderService")
public class OrderService implements InitializingBean, ApplicationContextAware {

    private ApplicationContext applicationContext;

    public String addOrder() {

        return UUID.randomUUID().toString();

    }

    private PackageService packageService;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(packageService.getShipping());
    }

    public void moreStuff() {
        System.out.println("What...more stuff...no way!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

        packageService = applicationContext.getBean("packageService", PackageService.class);
    }
}

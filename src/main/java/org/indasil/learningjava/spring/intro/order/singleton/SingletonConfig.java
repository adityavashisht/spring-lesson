package org.indasil.learningjava.spring.intro.order.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vashishta on 9/21/15.
 */
@Configuration
public class SingletonConfig {

    /**
     *
     *
     *
     * <bean id="orderService" class="org.indasil.learningjava.spring.intro.order.singleton.OrderService" init-method="moreStuff"/>
     <bean id="packageService" class="org.indasil.learningjava.spring.intro.order.singleton.PackageService"/>


     */

    @Bean
    public OrderService getOrderService() {
        return new OrderService();
    }

    @Bean
    public PackageService getPackageService() {
        return new PackageService();
    }


}

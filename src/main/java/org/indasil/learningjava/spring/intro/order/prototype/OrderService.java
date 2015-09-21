package org.indasil.learningjava.spring.intro.order.prototype;

import java.util.UUID;

/**
 * Created by vashishta on 9/21/15.
 */
public class OrderService {

    public String addOrder() {

        return UUID.randomUUID().toString();

    }

}

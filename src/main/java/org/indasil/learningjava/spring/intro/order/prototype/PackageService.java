package org.indasil.learningjava.spring.intro.order.prototype;

import java.util.UUID;

/**
 * Created by vashishta on 9/21/15.
 */
public class PackageService {

    public String getShipping() {
        return UUID.randomUUID().toString();
    }
}

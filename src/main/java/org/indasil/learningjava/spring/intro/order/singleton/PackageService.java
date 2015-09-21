package org.indasil.learningjava.spring.intro.order.singleton;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by vashishta on 9/21/15.
 */
@Component("packageService")

public class PackageService {

    public String getShipping() {
        return UUID.randomUUID().toString();
    }
}

package org.indasil.learningjava.spring.intro.tech;

/**
 * Created by vashishta on 9/18/15.
 */
public class Development {

    private Coder coder;

    public Development(Coder coder) {
        this.coder = coder;
    }

    public void start() {
        coder.writeCode();
    }
}

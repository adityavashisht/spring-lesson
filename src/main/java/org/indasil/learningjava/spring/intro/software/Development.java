package org.indasil.learningjava.spring.intro.software;

/**
 * Created by vashishta on 9/18/15.
 */
public class Development {

    private Coder coder;

    private Coder coderTwo;

    public void setCoderTwo(Coder coderTwo) {
        this.coderTwo = coderTwo;
    }

    public void setCoder(Coder coder) {
        this.coder = coder;
    }

    public void start() {
        coder.writeCode();
    }
}

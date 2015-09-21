package org.indasil.learningjava.spring.intro.tech;

/**
 * Created by vashishta on 9/18/15.
 */
public class JavaCoder implements Coder {

    @Override
    public void writeCode() {
        System.out.println("Java Code");
    }

    public void shutdown() {
        System.out.println("I am shutting down");
    }
}

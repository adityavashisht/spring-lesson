package org.indasil.learningjava.spring.intro.simple;

/**
 * Created by vashishta on 9/18/15.
 */
public class SlaveDriver {

    public static void main(String[] args) {

        Manager manager = new Manager();

        Employee employee = new Employee();

        Contractor contractor = new Contractor();

        manager.setEmployee(employee);
        manager.setContractor(contractor);

        manager.delegateTask();
    }
}

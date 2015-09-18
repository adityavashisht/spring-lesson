package org.indasil.learningjava.spring.intro.simple;

import java.util.List;

/**
 * Created by vashishta on 9/18/15.
 */
public class Manager {

    private Employee employee;

    private Contractor contractor;

    private List<Employee> employeeList;

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    public void delegateTask() {
        employee.doSomething();
        contractor.doWork();

        for (Employee em : employeeList) {
            em.doSomething();
        }
    }

    public void contractorOnly() {
        contractor.doWork();
    }
}

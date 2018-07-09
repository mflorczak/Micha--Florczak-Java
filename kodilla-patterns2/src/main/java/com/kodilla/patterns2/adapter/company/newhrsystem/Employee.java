package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    private final String peselId;
    private final String name;
    private final String lastname;
    private final BigDecimal baseSalary;

    public Employee(String peselId, String name, String lastname, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.name = name;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(peselId, employee.peselId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(peselId);
    }
}

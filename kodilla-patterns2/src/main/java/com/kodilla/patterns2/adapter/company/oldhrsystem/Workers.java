package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"123456789", "John", "Smith"},
            {"123213256", "Ivone", "Novak"},
            {"432425543", "Jessie", "Pinkman"},
            {"879832757", "Walter", "White"},
            {"898329853", "Clara", "Lanson"}};

    private double[] salaries = {
            4500.00,
            3500.00,
            8000.00,
            9000.00,
            6200.00};

    public String getWorker(int n) {
        if(n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + "," + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}

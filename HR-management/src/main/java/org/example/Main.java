package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        SetUp setUp = new SetUp();
        int numEmployees = 40; // кол -во сотрудников (40 в задании)
        setUp.setUP(employees, numEmployees);

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}

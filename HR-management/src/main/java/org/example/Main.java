package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
		public static void main(String[] args) {

				List<Employee> employees = new ArrayList<>();
				SetUp setUp = new SetUp();
				int numEmployees = 4; // кол -во сотрудников (40 в задании)
				setUp.setUP(employees, numEmployees);

				for (Employee employee : employees) {
						System.out.println(employee.toString());
				}
				System.out.println();

				ServiceCollection serviceCollection = new ServiceCollection();

// - показать всех отсортировав по имени
				System.out.println(" - показать всех отсортировав по имени");
				serviceCollection.sortAllEmployeesName(employees);

				for (Employee employee : employees) {
						System.out.println(employee.toString());
				}
				System.out.println();

// - показать всех отсортировав по зарплате
				System.out.println(" - показать всех отсортировав по зарплате");
				serviceCollection.sortAllEmployeesSalary(employees);

				for (Employee employee : employees) {
						System.out.println(employee.toString());
				}
				System.out.println();
		}
}


package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ServiceCollection {
		// - показать всех отсортировав по имени
		public void sortAllEmployeesName(List<Employee> employees) {
				Collections.sort(employees);
		}

		// - показать всех отсортировав по зарплате
		public void sortAllEmployeesSalary(List<Employee> employees) {
				employees.sort(Comparator.comparingDouble(Employee::getSalary));
		}
}


package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.example.ServiceCollection.getAvgSalDep;

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
				ServiceCollection.getSortAllEmployeesName(employees);

				for (Employee employee : employees) {
						System.out.println(employee.toString());
				}
				System.out.println();

// - показать всех отсортировав по зарплате
				System.out.println(" - показать всех отсортировав по зарплате");
				ServiceCollection.getSortAllEmployeesSalary(employees);

				for (Employee employee : employees) {
						System.out.println(employee.toString());
				}
				System.out.println();

// - показать имя, фамилию, департамент и грейд
				System.out.println(" - показать имя, фамилию, департамент и грейд");
				List<String> employee4Fields = ServiceCollection.getDisplNameSurnameDeptGrade(employees);

				for (String employee4F : employee4Fields) {
						System.out.println(employee4F);
				}
				System.out.println();

// - показать среднюю зарплату по департаментам
				System.out.println(" - показать среднюю зарплату по департаментам");
				Map<Department, Double> depAvgSal = serviceCollection.getAvgSalDep(employees);

				for (Department department : depAvgSal.keySet()) {
						double avgSal = depAvgSal.get(department);
						System.out.printf("Департамент: %s, Средняя зарплата: %.2f%n", department, avgSal);
				}

// - показать имя, фамилию и грейд только у тех кто выполнил план. hasPlanBeenCompleted = тру
				System.out.println("показать имя, фамилию и грейд только у тех кто выполнил план. hasPlanBeenCompleted = тру");
				List<String> employee3Fields = ServiceCollection.getNameSurnameGradePlanComp(employees);

				for (String employee3F : employee3Fields) {
						System.out.println(employee3F);
				}
				System.out.println();
		}
}


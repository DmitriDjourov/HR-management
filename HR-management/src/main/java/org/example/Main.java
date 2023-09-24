package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.example.ServiceCollection.getAvgSalDep;

public class Main {
		public static void main(String[] args) {

				List<Employee> employees = new ArrayList<>();
				SetUp setUp = new SetUp();
				int numEmployees = 40; // кол -во сотрудников (40 в задании)
				setUp.setUP(employees, numEmployees);
				System.out.println("\n Список сотрудников :");
				for (Employee employee : employees) {
						System.out.println(employee.toString());
				}
				System.out.println();

				ServiceCollection serviceCollection = new ServiceCollection();

// - показать всех отсортировав по имени
				System.out.println("\n - показать всех отсортировав по имени");
				ServiceCollection.getSortAllEmployeesName(employees);

				for (Employee employee : employees) {
						System.out.println(employee.toString());
				}
				System.out.println();

// - показать всех отсортировав по зарплате
				System.out.println("\n - показать всех отсортировав по зарплате");
				ServiceCollection.getSortAllEmployeesSalary(employees);

				for (Employee employee : employees) {
						System.out.println(employee.toString());
				}
				System.out.println();

// - показать имя, фамилию, департамент и грейд
				System.out.println("\n - показать имя, фамилию, департамент и грейд");
				List<String> employee4Fields = ServiceCollection.getDisplNameSurnameDeptGrade(employees);

				for (String employee4F : employee4Fields) {
						System.out.println(employee4F);
				}
				System.out.println();

// - показать среднюю зарплату по департаментам
				System.out.println("\n - показать среднюю зарплату по департаментам");
				Map<Department, Double> depAvgSal = serviceCollection.getAvgSalDep(employees);

				for (Department department : depAvgSal.keySet()) {
						double avgSal = depAvgSal.get(department);
						System.out.printf("\n Департамент: %s, Средняя зарплата: %.2f%n", department, avgSal);
				}

// - показать имя, фамилию и грейд только у тех кто выполнил план. hasPlanBeenCompleted = тру
				System.out.println("\n - показать имя, фамилию и грейд только у тех кто выполнил план. hasPlanBeenCompleted = тру");
				List<String> employee3Fields = ServiceCollection.getNameSurnameGradePlanComp(employees);

				for (String employee3F : employee3Fields) {
						System.out.println(employee3F);
				}
				System.out.println();

// - повысить % бонуса у всех сотрудников того департамента, в котором больше всего сотрудников hasPlanBeenCompleted = тру,
//	 если таких несколько то повысить у всех.
				System.out.println("\n - повысить % бонуса у всех сотрудников того департамента, в котором больше всего " +
						                   "сотрудников hasPlanBeenCompleted = тру, если таких несколько то повысить у всех.");

				System.out.println("\n Информация о сотрудниках до повышения бонуса: ");
				for (Employee employee : employees) {
						System.out.println("Имя: " + employee.getName() +
								                   ", Фамилия: " + employee.getSurname() +
								                   ", Департамент: " + employee.getDepartment() +
								                   ", Грейд: " + employee.getGrade() +
								                   ", % бонуса: " + employee.getBonusPCT() + "%");
				}
				double bonusUp = 10.0; // поднять на 10%
				List<Department> maxDepartments = ServiceCollection.getEmpPlanTrueBonusUp(employees, bonusUp);

				System.out.println("\n Департаменты для которых повышаем бонус : ");
				for (Department department : maxDepartments) {
						System.out.println(department);
				}

				System.out.println("\n Информация о сотрудниках после повышения бонуса: ");
				for (Employee employee : employees) {
						System.out.println("Имя: " + employee.getName() +
								                   ", Фамилия: " + employee.getSurname() +
								                   ", Департамент: " + employee.getDepartment() +
								                   ", Грейд: " + employee.getGrade() +
								                   ", % бонуса: " + employee.getBonusPCT() + "%");
				}

// - понизить % бонуса у департамента у которого меньше всего сотрудников выполнило план, если таких несколько то у всех
				System.out.println("\n- понизить % бонуса у департамента у которого меньше всего сотрудников выполнило план, " +
						                   "если таких несколько то у всех");

				System.out.println(" \n Информация о сотрудниках до понижения бонуса: ");
				for (Employee employee : employees) {
						System.out.println("Имя: " + employee.getName() +
								                   ", Фамилия: " + employee.getSurname() +
								                   ", Департамент: " + employee.getDepartment() +
								                   ", Грейд: " + employee.getGrade() +
								                   ", % бонуса: " + employee.getBonusPCT() + "%");
				}
				double bonusDown = 10.0; // Понизить на 10%
				List<Department> minDepartmentsDown = ServiceCollection.getEmpPlanFalseBonusDown(employees, bonusDown);

				System.out.println("\n Департаменты для которых понижаем бонус: ");
				for (Department department : minDepartmentsDown) {
						System.out.println(department);
				}
				System.out.println("\n Информация о сотрудниках после понижения бонуса: ");
				for (Employee employee : employees) {
						System.out.println("Имя: " + employee.getName() +
								                   ", Фамилия: " + employee.getSurname() +
								                   ", Департамент: " + employee.getDepartment() +
								                   ", Грейд: " + employee.getGrade() +
								                   ", % бонуса: " + employee.getBonusPCT() + "%");
				}
// - у департамента продаж взять всех кто выполнили план и если у сотруднка который выполнил план грейд А то повысить
//   зп и бонус,если грейд ниже то повысить на 1 ступень и только зп.

				System.out.println("\n - у департамента продаж взять всех кто выполнили план и если у сотруднка который выполнил план грейд А то повысить зп и бонус,\n" +
						                   " если грейд ниже то повысить на 1 ступень и только зп.");

				System.out.println("\n Сотрудники департамента SALES до изменения зарплаты и бонусов:");
				for (Employee employee : employees) {
						if (employee.getDepartment() == Department.SALES) {
								System.out.println("Имя: " + employee.getName() +
										                   ", Фамилия: " + employee.getSurname() +
										                   ", Департамент: " + employee.getDepartment() +
										                   ", Грейд: " + employee.getGrade() +
										                   ", ЗП: " + employee.getSalary() +
										                   ", % бонуса: " + employee.getBonusPCT() + "%");
						}
				}

				List<Employee> updatedEmployees = ServiceCollection.getUpSalaryAndBonusForSales(employees);

				System.out.println("\n Сотрудники департамента SALES после изменения зарплаты и бонусов:");
				for (Employee employee : updatedEmployees) {
						if (employee.getDepartment() == Department.SALES) {
								System.out.println("Имя: " + employee.getName() +
										                   ", Фамилия: " + employee.getSurname() +
										                   ", Департамент: " + employee.getDepartment() +
										                   ", Грейд: " + employee.getGrade() +
										                   ", ЗП: " + employee.getSalary() +
										                   ", % бонуса: " + employee.getBonusPCT() + "%");
						}
				}
		}
}


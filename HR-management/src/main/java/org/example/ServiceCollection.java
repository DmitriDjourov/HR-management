package org.example;

import java.util.*;


public class ServiceCollection {
		// - показать всех отсортировав по имени
		public static void getSortAllEmployeesName(List<Employee> employees) {
				Collections.sort(employees);
		}

		// - показать всех отсортировав по зарплате
		public static void getSortAllEmployeesSalary(List<Employee> employees) {
				employees.sort(Comparator.comparingDouble(Employee::getSalary));
		}

		// - показать имя, фамилию, департамент и грейд
		public static List<String> getDisplNameSurnameDeptGrade(List<Employee> employees) {
				List<String> fourFildsInfoList = new ArrayList<>();
				for (Employee employee : employees) {
						String fourFieldsInfo = "  " + employee.getName() + "  " + employee.getSurname() + "  "
								                        + employee.getDepartment() + "  " + employee.getGrade() + "  ";
						fourFildsInfoList.add(fourFieldsInfo);
				}
				return fourFildsInfoList;
		}

		// - показать среднюю зарплату по департаментам
		public static Map<Department, Double> getAvgSalDep(List<Employee> employees) {
				Map<Department, Double> depAvgSal = new HashMap<>();
				Map<Department, Integer> depEmpCount = new HashMap<>();

				for (Employee employee : employees) {
						Department department = employee.getDepartment();
						double salary = employee.getSalary();

						depAvgSal.put(department, depAvgSal.getOrDefault(department, 0.0) + salary);
						depEmpCount.put(department, depEmpCount.getOrDefault(department, 0) + 1);
				}

				for (Department department : depAvgSal.keySet()) {
						double totalSal = depAvgSal.get(department);
						int empCount = depEmpCount.get(department);
						double avgSal = totalSal / empCount;

						depAvgSal.put(department, avgSal);
				}

				return depAvgSal;
		}

		// - показать имя, фамилию и грейд только у тех кто выполнил план. hasPlanBeenCompleted = тру
		public static List<String> getNameSurnameGradePlanComp(List<Employee> employees) {
				List<String> treeFildsInfoList = new ArrayList<>();

				for (Employee employee : employees) {
						if (employee.isHasPlanBeenCompleted()) {
								String treeFieldsInfo = "  " + employee.getName() + "  " + employee.getSurname() + "  " + employee.getGrade();
								treeFildsInfoList.add(treeFieldsInfo);
						}
				}
				return treeFildsInfoList;
		}
}


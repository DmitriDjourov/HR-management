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

		// - повысить % бонуса у всех сотрудников того департамента, в котором больше всего сотрудников hasPlanBeenCompleted = тру,
		//   если таких несколько то повысить у всех.
		public static List<Department> getEmpPlanTrueBonusUp(List<Employee> employees, double bonusUp) {
				// Логика увеличения бонусов и поиска департамента(ов) с наибольшим количеством выполненных планов
				Map<Department, Integer> depEmpCount = new HashMap<>();
				List<Department> maxDep = new ArrayList<>();
				int maxCount = Integer.MIN_VALUE;

				for (Employee employee : employees) {
						if (employee.isHasPlanBeenCompleted()) {
								Department department = employee.getDepartment();
								depEmpCount.put(department, depEmpCount.getOrDefault(department, 0) + 1);
								int count = depEmpCount.get(department);

								if (count > maxCount) {
										maxCount = count;
										maxDep.clear();
										maxDep.add(department);
								} else if (count == maxCount && !maxDep.contains(department)) {
										maxDep.add(department);
								}

								double BonusPct = employee.getBonusPCT();
								double newBonusPct = BonusPct + (BonusPct * bonusUp / 100);
								employee.setBonusPCT(newBonusPct);
						}
				}
				return maxDep;
		}
}



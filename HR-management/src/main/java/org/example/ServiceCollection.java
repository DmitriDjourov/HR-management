package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ServiceCollection {
		// - показать всех отсортировав по имени
		public void getSortAllEmployeesName(List<Employee> employees) {
				Collections.sort(employees);
		}

		// - показать всех отсортировав по зарплате
		public void getSortAllEmployeesSalary(List<Employee> employees) {
				employees.sort(Comparator.comparingDouble(Employee::getSalary));
		}

		// - показать имя, фамилию, департамент и грейд
		public List<String> getDisplNameSurnameDeptGrade(List<Employee> employees) {
				List<String> fourFildsInfoList = new ArrayList<>();
				for (Employee employee : employees) {
						String fourFieldsInfo = "  " + employee.getName() + "  " + employee.getSurname() + "  "
								                        + employee.getDepartment() + "  " + employee.getGrade() + "  ";
						fourFildsInfoList.add(fourFieldsInfo);
				}
				return fourFildsInfoList;
		}
}


package org.example;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Generator {
		private Faker faker = new Faker();

		public String empIdGen() {
				String idEmp = "EMP" + faker.random().nextInt(1, 99);
				return idEmp;
		}

		public List<Employee> empGen(int numEmployees) {

				SetUp setUp = new SetUp();
				List<Employee> employees = new ArrayList<>();

				for (int i = 0; i < numEmployees; i++) {

						String empId = empIdGen();
						String name = faker.name().firstName();
						String surname = faker.name().lastName();
						Grade grade = Grade.values()[faker.random().nextInt(Grade.values().length)];
						double salary = faker.number().randomDouble(2, 2000, 5000);
						double bonusPCT = faker.number().randomDouble(2, 0, 1); // процент бонуса (0-100%)
						boolean hasPlanBeenCompleted = faker.random().nextBoolean();
						Department department = Department.values()[faker.random().nextInt(Department.values().length)];

						Employee employee = new Employee(empId, name, surname, grade, salary, bonusPCT, hasPlanBeenCompleted, department);
						employees.add(employee);
				}
				return employees;
		}
}

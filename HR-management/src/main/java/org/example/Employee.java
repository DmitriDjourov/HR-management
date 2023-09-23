package org.example;

import lombok.*;

//@Data
//@AllArgsConstructor
//@Builder

public class Employee implements Comparable<Employee> {
		private String id;
		private String name;
		private String surname;
		private Grade grade;
		private double salary;
		private double bonusPCT;
		private boolean hasPlanBeenCompleted;

		public Employee() {
		}

		public Employee(String id, String name, String surname, Grade grade, double salary, double bonusPCT, boolean hasPlanBeenCompleted) {
				this.id = id;
				this.name = name;
				this.surname = surname;
				this.grade = grade;
				this.salary = salary;
				this.bonusPCT = bonusPCT;
				this.hasPlanBeenCompleted = hasPlanBeenCompleted;
		}

		public String getId() {
				return id;
		}

		public void setId(String id) {
				this.id = id;
		}

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public String getSurname() {
				return surname;
		}

		public void setSurname(String surname) {
				this.surname = surname;
		}

		public Grade getGrade() {
				return grade;
		}

		public void setGrade(Grade grade) {
				this.grade = grade;
		}

		public double getSalary() {
				return salary;
		}

		public void setSalary(double salary) {
				this.salary = salary;
		}

		public double getBonusPCT() {
				return bonusPCT;
		}

		public void setBonusPCT(double bonusPCT) {
				this.bonusPCT = bonusPCT;
		}

		public boolean isHasPlanBeenCompleted() {
				return hasPlanBeenCompleted;
		}

		public void setHasPlanBeenCompleted(boolean hasPlanBeenCompleted) {
				this.hasPlanBeenCompleted = hasPlanBeenCompleted;
		}

		@Override
		public String toString() {
				return "Employee{" +
									 "id=" + id +
									 ", name='" + name + '\'' +
									 ", surname='" + surname + '\'' +
									 ", grade=" + grade +
									 ", salary=" + salary +
									 ", bonusPCT=" + bonusPCT +
									 ", hasPlanBeenCompleted=" + hasPlanBeenCompleted +
									 '}';
		}

		@Override
		public int compareTo(Employee otherEmployee) {
				return this.name.compareTo(otherEmployee.name);
		}
}


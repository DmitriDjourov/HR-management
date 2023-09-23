package org.example;

import java.util.ArrayList;
import java.util.List;

public class SetUp {
		public void setUP(List<Employee> employees, int numEmployees) {
				Generator gtr = new Generator();
				List<Employee> gtrEmployees = gtr.empGen(numEmployees);
				employees.addAll(gtrEmployees);
		}
}


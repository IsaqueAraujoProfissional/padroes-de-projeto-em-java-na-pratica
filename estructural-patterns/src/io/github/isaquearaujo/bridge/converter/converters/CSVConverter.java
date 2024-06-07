package io.github.isaquearaujo.bridge.converter.converters;

import io.github.isaquearaujo.bridge.converter.employees.Employee;

import java.util.Locale;


public class CSVConverter implements Converter {

	@Override
	public String getEmployeeFormated(Employee emp) {
		return String.format(Locale.US, "%s,%d,%.2f", 
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}

package kh.chaptes12_Collection.emp.controller;

import java.util.Comparator;

import com.kh.emp.model.vo.Employee;

public class DescNameSort implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getName().compareTo(e2.getName());
	}

}

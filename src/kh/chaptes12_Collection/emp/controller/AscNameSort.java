package kh.chaptes12_Collection.emp.controller;

import java.util.Comparator;

import com.kh.emp.model.vo.Employee;

public class AscNameSort implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
//		Employee e1 = (Employee)o1;
//		Employee e2 = (Employee)o2;
		return e1.getName().compareTo(e2.getName());
	}

}

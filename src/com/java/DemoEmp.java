package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DemoEmp {
	public static void main(String[] args) {

		
		for(int i=0;true;i++) {
			System.out.println("welcome");
			break;
		}
		
		
		try
		{
			int a=0;
			int b=2;
			int c=a+b;
			return;
		//	System.exit(0);
			
		}
		catch(Exception e) {System.out.println(e);}
		finally
		{
		
		
		}
		
		/*
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Abhishek", 45000.9);
		Employee e2 = new Employee(2, "Abhishek", 55555.9);
		Employee e3 = new Employee(3, "Yogesh", 50000.9);
		Employee e4 = new Employee(4, "Pawan", 40000.9);
		
		empList.add(e2);
		
		empList.add(e4);
		empList.add(e1);
		empList.add(e3);
		
		//empList.stream().map(e1->e1.getEmpSalary())
		
		Iterator<Employee> itr=empList.iterator();
		while(itr.hasNext())
		{
			Employee emp=itr.next();
			System.out.println(emp.getEmpName());
		}
		
		
		System.exit(0);
		
		Collections.sort(empList, new EmpNameSort());
		System.out.println(empList);
	
	*/
	}
}

class EmpIdSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return (o1.getEmpId() - o2.getEmpId());

	}
}

class EmpNameSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getEmpName().compareTo(o2.getEmpName()) == 0)

			return o1.getEmpId() - o2.getEmpId();
		else
			return o1.getEmpName().compareTo(o2.getEmpName());

	}
}
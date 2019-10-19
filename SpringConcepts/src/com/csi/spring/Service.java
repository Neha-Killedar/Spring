package com.csi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		CoreFrame core = (CoreFrame) context.getBean("emp");

		core.setEmpId(111);
		core.setEmpName("JERRY");
		core.setEmpAddress("JAPAN");
		core.setEmpDesignation("JAVA DEVELOPER");
		core.setEmpSalary(542132.20);
		core.setEmpContact(211132321);

		System.out.println("\n Employee Id:" + core.getEmpId() + "\n Employee Name: " + core.getEmpName()
				+ "\n Employee Address: " + core.getEmpAddress() + "\n Employee Designation: "
				+ core.getEmpDesignation() + "\n Employee Salary: " + core.getEmpSalary()
				+ "\n Employee Contact Number: " + core.getEmpContact());

	}
}

package com.csi.spring;

public class CoreFrame {

	private int empId;
	private String empName;
	private String empAddress;
	private String empDesignation;
	private double empSalary;
	private long empContact;
	
	public void setEmpId(int empId){
		this.empId= empId;
	}
	public int getEmpId(){
		return empId;
	}
	
	public void setEmpName(String empName){
		this.empName=empName;
	}
	public String getEmpName(){
		return empName;
	}
	
	public void setEmpAddress(String empAddress){
		this.empAddress=empAddress;
	}
	public String getEmpAddress(){
		return empAddress;
	}
	
	public void setEmpDesignation(String empDesignation){
		this.empDesignation=empDesignation;
	}
	public String getEmpDesignation(){
		return empDesignation;
	}
	
	public void setEmpSalary(double empSalary){
		this.empSalary=empSalary;
	}
	public double getEmpSalary(){
		return empSalary;
	}
	public void setEmpContact(long empContact){
		this.empContact=empContact;
	}
	public long getEmpContact(){
		return empContact;
	}
	
	
}

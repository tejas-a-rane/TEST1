
package com.employee;
class Employee{
	String name;
	int id;
	double sal;
	String address;
	
	Employee(String name,int id,double sal,String address){
		this.address = address;
		this.sal = sal;
		this.id = id;
		this.name = name;
	}
	Employee(){
		
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
}
public class Main {
public static void main(String[] args) {
	Employee employee = new Employee("tejas", 1,2550,"Borivali");
	System.out.println(employee);
	Employee employee2 = new Employee();
	employee2.address="Borivali";
	employee2.id=2;
	employee2.name="tej";
	employee2.sal=2300;
	
	
	System.out.println(employee2.name);
	System.out.println(employee2.id);
	System.out.println(employee2.sal);
	System.out.println(employee2.address);
	
}
}

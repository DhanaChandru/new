package org.task;

public class Employee {
// Create an object for employee class and call above methods also follow the all coding standards.
//  Methods   :empId(),empName(),empDob(),empPhone(),empEmail(),empAddress()
	int id = 13456;
	long phno=123456790l;
	String name = "Dhana", dob = "03/06/1995", 
		email = "dhanachandru@gmail.com", address = "No.12, Th"
				+ "ai Nagar, Velachery, Ch-600100.";	
	private void empId() {
		System.out.println("Emp ID= "+id);
	}
	private void empName() {
		System.out.println("Employee Name= "+name);
	}
	private void empDob() {
		System.out.println("DOB=  "+dob);
	}
	private void empPhone() {
		System.out.println("Contact no.= "+phno);
	}
	private void empEmail() {
		System.out.println("Email ID= "+email);
	}
	private void empAddress() {
		System.out.println("Emp Address= "+address);
	}
	public static void main(String[] args) {
		System.out.println("**************\nEmployee Detail\n**************");
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
	}


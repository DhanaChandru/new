package org.task;

public class MethodOverloading {
	private void empId(int a, int b) {
		System.out.println("Print Employee ID with age\nEmp ID# "+a+" - "+b+" years");
}
//You have to overload the method empId() based on different datatype in arguments.
	private void empId(double a, double b, double c) {
		System.out.println("Print Employee ID with Weight & Height \nID# "+a+" - "+b+" kgs - "+c+"c"
				+ "m");
}
// You have to overload the method companyName() based on different Number of arguments.
	private void empId(int a, int b, int c) {
		System.out.println("Print Employee ID with Age & Height \nID# "+a+" - "+b+" years - "+c+"cm");
}
// You have to overload the method phoneInfo() based on different datatype order in arguments.
	private void empId(String a, int b, double n) {
		System.out.println("Print Employee ID with Age & Salary Details\nID# "+a+" - "+b+" years"+"-Rs."+n);
}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.empId(123, 26);
		m.empId(123.0, 61.00, 157.00);
		m.empId(123, 26, 157);
		m.empId("123", 26, 20000.00);
	}
}

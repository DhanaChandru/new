package org.task;

import java.util.*;

public class ScannerPgm {
	
// Using Scanner class get the below details 
// empId, empName, empEmail, empPhoneno, empSalary, empGender, empCity

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Employee ID: ");
		s.nextInt();
		System.out.println("Enter your Employee Name: ");
		s.next();
		System.out.println("Enter your Email Address: ");
		s.next();
		System.out.println("Enter your Contact Number: ");
		s.nextLong();
		System.out.println("Enter your Monthly Salary");
		s.nextDouble();
		System.out.println("Enter your Gender: ");
		s.next().charAt(0);
		System.out.println("Enter your Current City: ");	
		s.next();
	}
}


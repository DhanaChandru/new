package org.task;

import java.util.Scanner;

public class ScannerAvg {
// Find the total and average of student marks using scanner class
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Name");
		String sname = s.nextLine();
		System.out.println("Enter Student ID");
		int sid = s.nextInt();
		System.out.println("**** Mark Details *****\n");
		System.out.println("English - ");
		int m1 = s.nextInt();
		System.out.println("Tamil - ");
		int m2 = s.nextInt();
		System.out.println("Mathematics - ");
		int m3 = s.nextInt();
		System.out.println("Science - ");
		int m4 = s.nextInt();
		System.out.println("Social Science - ");
		int m5 = s.nextInt();
		int t = m1+m2+m3+m4+m5;
		int avg = t/5;
		System.out.println("\nStudent ID - "+sid);
		System.out.println("Student Name - "+sname);
		System.out.println("Total Marks = "+t);
		System.out.println("Average = "+avg+"%\n\n");
		if (m1>=35||m2>=35||m3>=35||m4>=35||m5>=35) {
			System.out.println("*** Student - "+sname+" PASS with "+avg+"% ***");
		}
		else {
			System.out.println("*** Student - "+sname+" FAIL with "+avg+"% ***");
			
		}
	}
}

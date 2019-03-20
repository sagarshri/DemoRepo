package practiceprograms;

import java.util.Scanner;

public class EncaptulationTestMain {

	public static void main(String[] args) {
		EncaptulationTest EP = new EncaptulationTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the employee : ");
		String name = sc.nextLine();
		EP.setEmpName(name);
		System.out.println("Enter designation of the employee : ");
		String designation = sc.nextLine();
		EP.setDesignation(designation);
		System.out.println("Enter Salary of the employee : ");
		int salary = sc.nextInt();
		EP.setSalary(salary);
		EP.setGrossSalary(salary);
		System.out.println("Employee name is : " + EP.getEmpName());
		System.out.println("Employee designation is : " + EP.getDesignation());
		System.out.println("Employee Gross Salary is : " + EP.getGrossSalary());

	}

}

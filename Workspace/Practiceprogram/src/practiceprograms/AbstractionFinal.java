package practiceprograms;

import java.util.Scanner;

public class AbstractionFinal {

	public static void main(String[] args) {
		// Abstract class can not be instantiated. See the error at below line after removing the comment.
		//AbstractionTest ab = new AbstractionTest();
		
		AbstractionTestMain abm = new AbstractionTestMain();
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter name of the employee : ");
		String name = sc1.nextLine();
		abm.setEmpName(name);
		
		System.out.println("Enter position of the employee : ");
		String position = sc1.nextLine();
		abm.setPosition(position);
		
		System.out.println("Enter department of the employee : ");
		String dept = sc1.nextLine();
		abm.setDepartment(dept);
		
		System.out.println("Enter income of the employee : ");
		int income = sc1.nextInt();
		abm.setIncome(income);
		
		
				
		
		System.out.println("Name of the employee : " + abm.getEmpName());
		System.out.println("Position of the employee : " + abm.getPosition());
		System.out.println("Income of the employee : " + abm.getIncome());
		System.out.println("Department of the employee : " + abm.getDepartment());
		
		AbstractionTest ab = new AbstractionTestMain();
		
		System.out.println("Enter name of the employee : ");
		name = sc1.next();
		ab.setEmpName(name);
		
		System.out.println("Enter position of the employee : ");
		position = sc1.next();
		ab.setPosition(position);
		
		System.out.println("Enter income of the employee : ");
		income = sc1.nextInt();
		ab.setIncome(income);
		
		System.out.println("Enter department of the employee : ");
		dept = sc1.nextLine();
		// Parent class do not have "department" and can not set it.
		
		System.out.println("Name of the employee : " + ab.getEmpName());
		System.out.println("Position of the employee : " + ab.getPosition());
		System.out.println("Income of the employee : " + ab.getIncome());
		System.out.println("Department of the employee : " + ((AbstractionTestMain) ab).getDepartment());
        // Above line will give error as the method is not part of Abstract(parent) Class.
		// The error can be removed in two ways --
		// 1. Crate the method in Abstract(Parent Class)
		// 2. Using casting : 
		// System.out.println("Enter department of the employee : " + ((AbstractionTestMain) ab).getDepartment());
	}

	
}

package com.employeeExercise.ext;

//employee wage calculation using case statement
public class EmpWageCalculationUC4 {
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
	public static void main(String[] args) {
		int WAGE_PER_HOUR = 20;
		int total_hrs=0;
		double empCheck = Math.floor(Math.random()* 10) % 3;
		//math.random is for random values 
		//gives 0, 1, 2
		switch ((int)empCheck) {
		case IS_PRESENT:
			total_hrs=8;
			System.out.println("employee is present  ");
			break;
		case IS_PART_TIME:
			total_hrs=4;
			System.out.println("employee is part time");
			break;
      default:
      	System.out.println("employee is absent ");
      	break;
		}
		int wage=total_hrs*WAGE_PER_HOUR;
		System.out.println("employee wage : "+wage);
	}
}	
		
		
		
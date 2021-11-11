package com.employeeExercise.ext;

//calculation of employee wage of the days 20 or working hour 100 reaches first 
public class EmpWageCalculationUC6 {
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
	public static final int NO_OF_DAYS=20;
	public static final int TOTAL_WORKING_HRS=100;
	public static final int WAGE_PER_HOUR =20;
	public static void main(String[] args) {
		int WAGE_PER_HOUR = 20;
		int total_hrs=0;
		int total_emp_hrs=0;
		int total_wage=0;
		int total_working_days=0;
		//int NO_OF_DAYS=20;
		while (NO_OF_DAYS>=total_working_days && TOTAL_WORKING_HRS>=total_hrs) {
		      total_working_days++;
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
		total_emp_hrs +=total_hrs;
		
	}
		int wage=total_emp_hrs*WAGE_PER_HOUR;
		System.out.println("employee wage : "+wage);	
	System.out.println("employee  working hrs :" +total_emp_hrs);	
}	
}	
		

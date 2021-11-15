package com.employeeExercise.ext;

public class EmpWageCalculationUC8 {
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
	//public static final int NO_OF_DAYS = 20;
	//public static final int TOTAL_WORKING_HRS = 100;
	//public static final int WAGE_PER_HOUR = 20;

	public static int calculationOfWage(String company_Name ,int wagePerHour,int total_Working_Hours,int total_Working_Days) {
		//int WAGE_PER_HOUR = 20;
	    int total_hrs = 0;
		int emp_hrs = 0;
		//int total_wage = 0;
		int total_emp_hrs=0;
		int no_Of_days = 0;
		// int NO_OF_DAYS=20;
		while (total_emp_hrs<=total_Working_Days && no_Of_days<total_Working_Days) {
			total_Working_Days++;
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			// math.random is for random values
			// gives 0, 1, 2
			switch ((int) empCheck) {
			case IS_PRESENT:
				total_hrs = 8;
				System.out.println("employee is present  ");
				break;
			case IS_PART_TIME:
				total_hrs = 4;
				System.out.println("employee is part time");
				break;
			default:
				total_hrs = 0;
			}
			total_emp_hrs += total_hrs;

		}
		int wage = total_emp_hrs * wagePerHour;
		System.out.println("The "+company_Name+" has employee working hours "+total_emp_hrs+" total wage "+wage);
		return total_emp_hrs;
	}
	public static void main(String[] args) {
		calculationOfWage("TCS",50,25,30);
		calculationOfWage("techMahendra",55,22,27);
		
	}
 
}
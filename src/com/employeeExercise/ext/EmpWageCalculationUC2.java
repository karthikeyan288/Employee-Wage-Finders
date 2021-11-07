package com.employeeExercise.ext;

//calculation of employee daily hour

public class EmpWageCalculationUC2 {
	public static void main(String[] args) {
		int IS_PRESENT = 1;
		int WAGE_PER_HOUR = 20;
		int total_hrs=0;
		double empCheck = Math.floor(Math.random()* 10) % 2;
		//math.random is for random values
		if(empCheck == IS_PRESENT) {
			total_hrs=8;
           System.out.println("employee is present  ");
		}else
		{
			System.out.println("employee is absent ");
		}
		int wage=total_hrs*WAGE_PER_HOUR;
		System.out.println("employee wage : "+wage);
	}

}




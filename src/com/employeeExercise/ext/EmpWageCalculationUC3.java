package com.employeeExercise.ext;

//adding part time employee wage 

public class EmpWageCalculationUC3 {
	public static void main(String[] args) {
		int IS_PRESENT = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 20;
		int total_hrs=0;
		double empCheck = Math.floor(Math.random()* 10) % 3;
		//math.random is for random values 
		//gives 0, 1, 2
		if(empCheck == IS_PRESENT) {
			total_hrs=8;
         System.out.println("employee is present  ");
		}else if(empCheck == IS_PART_TIME){
			System.out.println("employee is part time");
			total_hrs=4;
		}else {		
	        System.out.println("employee is absent ");
		}
		int wage=total_hrs*WAGE_PER_HOUR;
		System.out.println("employee wage : "+wage);
	}

}



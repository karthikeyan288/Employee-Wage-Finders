package com.employeeExercise.ext;

//check employee is present or absent

public class EmpWageCalculationUC1 {
	public static void main(String[] args) {
		int IS_WORKING = 1;
		double empCheck = Math.floor(Math.random()* 10) % 2;
		//math.random is for random values
		if(empCheck == IS_WORKING) {
			System.out.println("employee is present ");
		}else
		{
			System.out.println("employee is absent");
		}
		
	}

}
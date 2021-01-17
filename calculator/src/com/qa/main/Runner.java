package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		int num1 = 25;
		int num2 = 50;
		
		Addition calc = new Addition();
		int addResult = calc.addition(num1,num2);
		System.out.println(num1 + "+" + num2 + "=" + addResult);
	
		Subtraction calc1 = new Subtraction();
		int subResult = calc1.subtraction(num1,num2);
		System.out.println(num1 + "-" + num2 + "=" + subResult);
	
		Multiplication calc2 = new Multiplication();
		int mulResult = calc2.multiplication(num1,num2);
		System.out.println(num1 + "*" + num2 + "=" + mulResult);
		
		Division calc3 = new Division();
		double divResult = calc3.division(num1,num2);
		if(num1<num2) {
			System.out.println("The division cannot be performed");
		} else {	
			System.out.println(num1 + "/" + num2 + "=" + divResult);
		}		
		
	}

}

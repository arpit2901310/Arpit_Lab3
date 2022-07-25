package com.balancedbrackets.arpit;

public class Driver {

	public static void main(String[] args) {
		BalancedBrackets balancedBrackets = new BalancedBrackets();
		String bracketExpression = "([[]]";

		
		Boolean result;
		
		result = balancedBrackets.areBracketsBalanced(bracketExpression);
        
		if (result)
			System.out.println("The entered String has Balanced Brackets"); 
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");
	 

	}
	}

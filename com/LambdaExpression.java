package com;

public class LambdaExpression {
	
	@FunctionalInterface
	interface MathOperation{
		int calculate(int a, int b );
		
		static void result(int a, int b, String function, MathOperation obj) {
			System.out.println("Result of " + function + " is " + obj.calculate(a, b));
		}
	}
	
	public static void main(String[] args) {
		MathOperation addition = (a, b) -> a+b;
		MathOperation substraction = (a,b) -> a-b;
		MathOperation multiply = (a,b) -> a*b;
		MathOperation division = (a,b) -> a / b;
		

		MathOperation.result(10,20,"Addition",addition);
		MathOperation.result(30,10,"Substraction",substraction);
		MathOperation.result(10,20,"Multiply",multiply);
		MathOperation.result(60,20,"Division",division);
	}
}

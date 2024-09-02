package com;

public class LambdaExpression {
	
	@FunctionalInterface
	interface MathOperation{
		int calculate(int a, int b );
	}
	
	public static void main(String[] args) {
		MathOperation addition = (a, b) -> a+b;
		MathOperation substraction = (a,b) -> a-b;
		MathOperation multiply = (a,b) -> a*b;
		MathOperation division = (a,b) -> a / b;
		
		System.out.println("Addition : " + addition.calculate(30, 20));
		System.out.println("Substraction : " + substraction.calculate(30, 20));
		System.out.println("Multiplication: " + multiply.calculate(30, 20));
		System.out.println("Division:  " + division.calculate(30, 20));
		
		
	}
}

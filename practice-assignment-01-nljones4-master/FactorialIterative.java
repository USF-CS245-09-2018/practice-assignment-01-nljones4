//package edu.usfca.cs.cs245; bloop
public class FactorialIterative implements Factorial {
	
	
	public int factorial(int n){
			int total = 1;
			
			for (int i = n; i > 0; i--){
				total = total * i;
			}
		return total;
	}
}
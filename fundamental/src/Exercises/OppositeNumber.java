package Exercises;

public class OppositeNumber {
	
	/*
	 Very simple, given an integer or a floating-point number, find its opposite.

     Examples:

	1: -1
	14: -14
	-34: 34
	
	 */
	
	public static void main(String[] args) {
		int value = 987;
		
		System.out.println(opposite(value));
		
		
	}
	
	public static int opposite(int number) {
		
       number = -number;    
	   return number;
    }

}

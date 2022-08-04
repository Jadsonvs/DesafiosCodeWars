package Exercises;

public class CalculateAverage {
	public static void main(String[] args) {
/*
 DESCRIPTION:
Write a function which calculates the average of the numbers in a given list.

Note: Empty arrays should return 0.
 */
		
		int[] array = {2, 2, 3};
		 
		 System.out.println(find_average(array));
		 
	}	 
	
	 public static double find_average(int[] array){
		 double soma = 0;
		 double media = 0;
		 for(int i = 0; i < array.length; i++) {
			 
			soma = soma + array[i];	
			media = soma / array.length;
				
		 }
		 return media;
 
	  }

}
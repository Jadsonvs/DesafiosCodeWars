package Exercises;

public class BeginnerLostWithoutAMap {
	
	/*
	 Given an array of integers, return a new array with each value doubled.

	For example:
	[1, 2, 3] --> [2, 4, 6]


	 */
	
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3};
		
		map(array);
		
	}
	
	public static int[] map(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		
			System.out.println("Posição -> " + i + " valor -> " + arr[i] + " <-");
		}
		return arr;
	  }

}

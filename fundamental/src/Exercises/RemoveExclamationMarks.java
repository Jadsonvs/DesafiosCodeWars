package Exercises;

public class RemoveExclamationMarks {
	
	public static void main(String[] args) {
/*
 
 Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
 
 */
		System.out.println(removeExclamationMarks("Hello! World!"));
		
		
	}
	
	 static String removeExclamationMarks(String s) {
		 String text = s.replace("!", "");
	        return text;
	    }

}

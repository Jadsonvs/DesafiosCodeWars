package Exercises;

public class Alarm {
	
/*
 Write a function named setAlarm which receives two parameters. The first parameter, employed, is true whenever you are employed
 and the second parameter, vacation is true whenever you are on vacation.

The function should return true if you are employed and not on vacation (because these are the circumstances under which you need
to set an alarm). It should return false otherwise. Examples:

setAlarm(true, true) -> false
setAlarm(false, true) -> false
setAlarm(false, false) -> false
setAlarm(true, false) -> true
 */
	
	public static void main(String[] args) {
		
		System.out.println(setAlarm(true, false));
		
		
	}
	
	static boolean setAlarm(boolean employed, boolean vacation) {
		
	    boolean empregado = (employed == true && vacation == false)? true : false;
	    
	    if(empregado) {
	    	System.out.println("Should be true");
	    }else {
	    	System.out.println("Should be false");
	    }
	    return empregado;
		
//		OU SIMPLISMENTE PODEMOS FAZER DA MANEIRA ABAIXO
//		
//		return employed == true && vacation == false;
	
	  
	  }
}

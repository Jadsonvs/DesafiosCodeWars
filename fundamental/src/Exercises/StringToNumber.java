package Exercises;

public class StringToNumber {
	
	public static void main(String[] args) {
		String numeros = "1234";
		
		System.out.println(stringToNumber(numeros));
		
	}
	
	public static int stringToNumber(String str) {
		int numero = Integer.parseInt(str);
		return numero;
	  }
	

}

package Exercises;

public class ReverseWords {
	
	/*
	 * 
	 Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

	Examples
	"This is an example!" ==> "sihT si na !elpmaxe"
	"double  spaces"      ==> "elbuod  secaps"
	
	 */
	
	public static void main(String[] args) {
		final String ORIGINAL = "Luciana Borges";
		
		System.out.println(reverseWords(ORIGINAL));
		
		
		
	}
	
//	public static String reverseWords(final String original) {
//		String[] sd = original.split(" ");
//		String texto = "";
//		for(int i = 0; i < sd.length; i++) {
//			char[] palavra = sd[i].toCharArray();
//			
//			for(int y = palavra.length - 1; y >= 0; y-- ) {
//				texto = texto + palavra[y];
//			}
//			texto = texto + " ";
//		}
//		 return texto;
//
//	  }
	
	public static String reverseWords(final String original) {
//		String[] sd = original.split(" ");
		String texto = "";
		for(int i = original.length() - 1; i >= 0; i--) {
			char[] palavra = original.toCharArray();
			
			texto = texto + palavra[i];
//			texto = texto + " ";
		}
		 return texto;

	  }
}

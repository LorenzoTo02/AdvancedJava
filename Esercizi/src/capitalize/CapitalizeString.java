package capitalize;



public class CapitalizeString {

	public static void main(String[] args) {
		
		String src = "eric 90cartman";
		
		System.out.println(capitalizeFirstChars(src));
		
	}
	
	public static String capitalizeFirstChars(String src) {
		
		char[] charArray = src.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(i != 0) {
				if(Character.isLetter(charArray[i-1]) && Character.isLetter(charArray[i])) {
					
				} else {
					charArray[i] = Character.toUpperCase(charArray[i]);
				}
			} else {
				if(Character.isLetter(charArray[i])) {
					charArray[i] = Character.toUpperCase(charArray[i]);
				}
			}
		}
		
		return String.valueOf(charArray);
	}

}

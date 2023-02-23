package packageEcc;

public class ErroriE_Eccezioni {
	
	public static int addNatural(int a, int b) {
		if(a < 0) {
			
			throw new NotValidInputException("a < di 0");
		}
		
		if(b < 0) {
			
			throw new NotValidInputException("b < di 0");
		}
		return a + b;
	}

	public static void main(String[] args) {
		
		//Math ecception
		
		int a = 4;
		int b = -1;
				
		try {
			int c = addNatural(a, b);
			System.out.println(c);
		} catch (NotValidInputException e) {
			e.print();
		}
	
	}

}

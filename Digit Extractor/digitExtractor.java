
public class digitExtractor {
	
	protected String totalNumber; //Global Holding Variable for user input.
	
	public digitExtractor(String numberSequence){
		totalNumber = numberSequence;
	}
	
	public void returnInverted(){
		
		char charArray[] = new char[5]; //Sets up an array to store the characters inputed
		
		charArray[0] = totalNumber.charAt(4);
		charArray[1] = totalNumber.charAt(3);
		charArray[2] = totalNumber.charAt(2); //This section actually stores the characters
		charArray[3] = totalNumber.charAt(1);
		charArray[4] = totalNumber.charAt(0);
		
		System.out.println("\nFlow\n\n" + charArray[0] + charArray[1] + charArray[2] + charArray[3] + charArray[4] + "\n");
		//Reverses w/o Stacking
		System.out.println("Stacked\n\n" + charArray[0] + "\n" + charArray[1] + "\n" + charArray[2] + "\n" + charArray[3] + "\n" + charArray[4]);
		//Stacks up the characters in inverted order
		
	}

}

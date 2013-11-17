import java.util.Scanner;
public class digitExtractorExecute {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Hello, welcome to the Digit Extractor! Please enter 5 digits ^_^ : ");
		String input = sc.nextLine();
		digitExtractor dE = new digitExtractor(input);
		dE.returnInverted();
		
	}

}

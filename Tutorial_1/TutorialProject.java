import java.util.Scanner;
public class TutorialProject {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		
		inputTest();
		
	}

	public static void inputTest(){
		
		String password;
		System.out.println("Please enter the password: ");
		password = input.nextLine();
		
		if (password.equals("fuckoff")){
			System.out.println("Welcome!");	
		}
		
		else {
			System.out.println("Wrong password, terminating the application");
		}
		
	}
	
}

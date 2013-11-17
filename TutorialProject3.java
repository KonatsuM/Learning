import java.util.Scanner;
public class TutorialProject3 {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		
		requestPass();
		
	}
	
	public static boolean passwordCheck(){
		
		String pass;
		System.out.println("Please enter your password: ");
		pass = input.nextLine();
		
		if(pass.equals("magic")){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static void requestPass(){
			
		int passTries = 0;
		while(!passwordCheck()){
			
			passTries++;
			if(passTries == 4){
				System.out.println("You've failed more than 3 times, terminating application in 5 seconds.");
				try {
						Thread.sleep(5000);
					} catch(InterruptedException e) {					
					} 
				System.exit(0);
			} else{
				System.out.println("You entered the wrong password, try again.");
			}		
			
		}
		
		System.out.println("Welcome back!");
		
	}

}

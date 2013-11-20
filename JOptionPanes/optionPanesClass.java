import javax.swing.JOptionPane;
public class optionPanesClass {
	
	public static void main(String[] args){
		
		//String fingers = JOptionPane.showInputDialog("How many fingers do you have?");
		//JOptionPane.showMessageDialog(null, "You have " + fingers + " fingers!");
		double number =	Double.parseDouble(JOptionPane.showInputDialog("What is 3/2? (Respond in decimal form)"));
		
		if ((number - 1.5) < 0.00001){			
			JOptionPane.showMessageDialog(null, "Hurray you can do the maths!");//Runs if the user entered 1.5
		}else{
			JOptionPane.showMessageDialog(null, "Wrong, the correct answer was 1.5");//Runs if the user entered a value other than 1.5
		}
		
	}

}

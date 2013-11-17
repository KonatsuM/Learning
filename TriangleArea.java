import java.util.Scanner;
public class TriangleArea {
	
	//Finds the area of a triangle based on user input
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		//These variables store base and height of the triangle
		double triangleBase;
		double triangleHeight;
		
		//Gets the base and height of the triangle from the user
		System.out.println("Enter the base of the triangle: ");
		triangleBase = sc.nextDouble();
		System.out.println("Enter the height of the triangle: ");
		triangleHeight = sc.nextDouble();
		
		//Variable for the area of the triangle
		double triangleArea = triangleBase * triangleHeight / 2;
		System.out.println("The area of the triangle is: " + triangleArea);
		
	}
	
}

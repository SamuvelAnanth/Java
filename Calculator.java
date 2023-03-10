import java.util.*;
public class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("\n\t\t\tCalculator");
		System.out.println("\t\t\t**********");	
		System.out.println("For Addition Press 1");
		System.out.println("For Subtraction Press 2");
		System.out.println("For Multiplication Press 3");
		System.out.println("For Division Press 4");
		System.out.println("For Modulus Press 5");
		System.out.print("Enter Your Option : ");
		int option=sc.nextInt();
		switch(option){
			case 1:
				System.out.println("\n\t\tAddition");
				System.out.println("\t\t********");	
				System.out.print("Enter the First Value to Addition : ");
				a=sc.nextInt();
				System.out.print("Enter the Second Value to Addition : ");
				b=sc.nextInt();
				c=a+b;
				System.out.println("The Addition of "+a+" and "+b+" is "+c);
				break;
			case 2:
				System.out.println("\n\t\tSubtraction");
				System.out.println("\t\t***********");	
				System.out.print("Enter the First Value to Subtraction : ");
				a=sc.nextInt();
				System.out.print("Enter the Second Value to Subtraction : ");
				b=sc.nextInt();
				c=a-b;
				System.out.println("The Subtraction of "+a+" and "+b+" is "+c);		
				break;	
			case 3:
				System.out.println("\n\t\tMultiplication");
				System.out.println("\t\t**************");	
				System.out.print("Enter the First Value to Multiplication : ");
				a=sc.nextInt();
				System.out.print("Enter the Second Value to Multiplication : ");
				b=sc.nextInt();
				c=a*b;
				System.out.println("The Multiplication of "+a+" and "+b+" is "+c);
				break;
			case 4:
				System.out.println("\n\t\tDivision");
				System.out.println("\t\t********");	
				System.out.print("Enter the First Value to Division : ");
				a=sc.nextInt();
				System.out.print("Enter the Second Value to Division : ");
				b=sc.nextInt();
				c=a/b;
				System.out.println("The Division of "+a+" and "+b+" is "+c);		
				break;
			case 5:
				System.out.println("\n\t\tModulus");
				System.out.println("\t\t*******");	
				System.out.print("Enter the First Value to Modulus : ");
				a=sc.nextInt();
				System.out.print("Enter the Second Value to Modulus : ");
				b=sc.nextInt();
				c=a%b;
				System.out.println("The Modulus of "+a+" and "+b+" is "+c);		
				break;
			default:
				System.out.println("Please Enter Valid Arithmetic Operation");
		}
	}
}
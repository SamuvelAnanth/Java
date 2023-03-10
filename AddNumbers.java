import java.util.*;
public class AddNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t\t\tAddition");
		System.out.println("\t\t\t********");		
		System.out.print("Enter the First Value to Addition : ");
		int a=sc.nextInt();
		System.out.print("Enter the Second Value to Addition : ");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("The Addition of "+a+" and "+b+" is "+c);
	}
}
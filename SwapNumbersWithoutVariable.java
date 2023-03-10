import java.util.*;
public class SwapNumbersWithoutVariable{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter the First Value : ");
		a=sc.nextInt();
		System.out.print("Enter the Second Value : ");
		b=sc.nextInt();	
		System.out.println("\t\tBefore Swapping");
		System.out.println("\t\t***************");
		System.out.println("The First Value is : "+a);
		System.out.println("The Second Value is : "+b);	
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("\t\tAfter Swapping");
		System.out.println("\t\t**************");
		System.out.println("The First Value is : "+a);
		System.out.println("The Second Value is : "+b);	
	}
}
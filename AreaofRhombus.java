import java.util.*;

public class Areaofrhombus{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Base area of Prism:");
	int Basearea = input.nextInt();
	System.out.println("Enter the Base width of Prism:");
	int Baseperimeter = input.nextInt();
	System.out.println("Enter the Height of Prism:");
	int Height = input.nextInt();
	int Area = (2*Basearea*Baseperimeter*Height);
	System.out.println("Area of perimeter is:" + Area);
	
	
	


}}
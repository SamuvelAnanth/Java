import java.util.*;

public class Areaofperimeter{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Base area:");
	int Basearea = input.nextInt();
	System.out.println("Enter the Base widt:");
	int Baseperimeter = input.nextInt();
	System.out.println("Enter the Height:");
	int Height = input.nextInt();
	int Area = (2*Basearea+Baseperimeter*Height);
	System.out.println("Area of perimeter is:" + Area);

}}
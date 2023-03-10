import java.util.*;
public class ArithmeticOperator{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
	System.out.println("Enter A :");
	int a = input.nextInt();
	
	System.out.println("Enter B :");
	int b = input.nextInt();

	System.out.println("Enter C :");
	int c = input.nextInt();
	
	System.out.println("Addition :" + (a+b-c));
	System.out.println("Subtraction :" + (a-b+c));
	System.out.println("Multiple :" + (a*b*c));
	System.out.println("Division :" + (a/b/c));
	System.out.println("Modules :" + (a%b%c));
	
	System.out.println(10<<2);
	System.out.println(10>>2);

	System.out.println(-10>>2);
	System.out.println(-10>>>2);
int a = 5;
int b = 10;
        String value = (a<b)?a:b;
	System.out.println("equal");
	
}
}


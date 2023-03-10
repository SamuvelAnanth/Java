import java.util.*;

class Math{
int a,b;

public void basicMath(int a, int b){
	System.out.println("Addition: " + (a+b));
	System.out.println("Multiplication: " + (a*b));
}

public static void main(String[] args){
	Math obj = new Math();
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	obj.a = scanner.nextInt();
	System.out.print("Enter the second number: ");
	obj.b = scanner.nextInt();
	obj.basicMath(obj.a, obj.b); 
	}
}
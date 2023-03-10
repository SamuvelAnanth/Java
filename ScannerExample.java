import java.util.*;
public class ScannerExample{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
	System.out.println("Enter your name");
	String Name = input.nextLine();
	System.out.println(Name);

	System.out.println("Enter your initial");
	String initial = input.nextLine();
	System.out.println(initial);

	System.out.println("Enter your Number");
	Long number = input.nextLong();
	System.out.println(number);

Scanner input1 = new Scanner(System.in);
	System.out.println("Enter your password");
	String password = input1.nextLine();
	System.out.println(password);

	System.out.println("login or signup");
	Boolean torf = input.nextBoolean();
	System.out.println("torf");
}
}
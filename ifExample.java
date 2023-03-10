import java.util.*;
	public class ifExample{
		public static void main(String[] args){
			Scanner number = new Scanner(System.in);
				System.out.print("Enter the Number : ");
				int a=number.nextInt();
					if(a==123){
						System.out.println("Condition 1 is Satisfied");
							if(a!=1234){
								System.out.println("Nested if is Satisfied");
							}
						}else if(a==1234){
							System.out.println("Condition 2 is Satisfied");
							} else {
							System.out.println("Both the Condition is not Satisfied");
							}
							}
				}